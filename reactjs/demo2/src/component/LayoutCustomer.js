import React from 'react'
import { useState,useEffect } from 'react'
import Avatar from 'antd/lib/avatar/avatar';
import SubMenu from 'antd/lib/menu/SubMenu';
import { Layout, Menu, Breadcrumb, Typography  } from 'antd';
import ListCustomers from './ListCustomers'
const { Header, Footer, Sider, Content } = Layout;
const { Title } = Typography;



const LayoutCustomer = () => {
  const [customers, setCustomers] = useState([])

  useEffect(() => {
    const getCustomers = async () => {
      const customersFromServer = await fetchTasks()
      setCustomers(customersFromServer)
    }
      getCustomers()
  }, [])

//  FETCH 
  const fetchTasks = async () => {
    const res = await fetch(`http://localhost:3000/customers`)
    const data = await res.json()
    return data
  }

  const deleteCustomer = async (id) => {
    await fetch(`http://localhost:3000/customers/${id}` , {
      method: 'DELETE',
    })
    
    setCustomers(customers.filter( (customer) => customer.id !== id))
  }
    return (
        <div>
            <Layout>
     <Header style = {{padding:12}}>
      <Avatar size={40} style = {{float: 'right'}} icon = 'user'/>
     <Title level={3} type="warning">Quản lí khách hàng</Title>
     </Header>
      <Layout>
      <Sider >
        <Menu
        defaultSelectedKeys={['Dashboard']}
        mode = 'inline'
        >
          <Menu.Item key='Dashboard'>
            Dashboard
          </Menu.Item>
          <SubMenu
          title={
            <span>
              <span>Natigation</span>
            </span>
          }>
            <Menu.ItemGroup key='AboutUs' title ='Menu'>
              <Menu.Item>Thế anh 1</Menu.Item>
              <Menu.Item>Thế anh 2</Menu.Item>
              <Menu.Item>Thế anh 3</Menu.Item>
              <Menu.Item>Thế anh 4</Menu.Item>    
            </Menu.ItemGroup>
          </SubMenu>
        </Menu>
      </Sider>
      <Layout>
      <Content style={{ padding: '0 50px' }}>
        
        <Breadcrumb style={{ margin: '16px 0' }}>
        <Breadcrumb.Item>List</Breadcrumb.Item>
        <Breadcrumb.Item><a href = "/create">Create</a></Breadcrumb.Item>
        <Breadcrumb.Item>Dashboard</Breadcrumb.Item>
      </Breadcrumb>
        
      <div style={{ background: '#fff', padding: 24, minHeight: 580 }}>
      <Title>Danh sách khách hàng</Title>
      {customers.length > 0 ? (
        <ListCustomers customers = {customers} onDelete = {deleteCustomer}/>
      ) : (
        'không có dữ liệu trong bảng'
      )}      </div>
    </Content>
    <Footer style={{ textAlign: 'center' }}>Ant Design ©2018 Created by Ant UED</Footer>      </Layout>
    </Layout>
    </Layout>
        </div>
    )
}

export default LayoutCustomer
