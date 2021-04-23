import React from 'react'
import Avatar from 'antd/lib/avatar/avatar';
import SubMenu from 'antd/lib/menu/SubMenu';
import { Layout, Menu, Breadcrumb, Typography  } from 'antd';
import ListCustomer from './ListCustomer'
const { Header, Footer, Sider, Content } = Layout;
const { Title } = Typography;


const LayoutCustomer = () => {
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
      <ListCustomer/>
      </div>
    </Content>
    <Footer style={{ textAlign: 'center' }}>Ant Design ©2018 Created by Ant UED</Footer>      </Layout>
    </Layout>
    </Layout>
        </div>
    )
}

export default LayoutCustomer
