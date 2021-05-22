import React from 'react'
import { Layout, Typography  } from 'antd';
import Avatar from 'antd/lib/avatar/avatar';

const { Title } = Typography;
const { Header } = Layout;





const HeaderCustomer = () => {
    return (
        <div>
    <Header style = {{padding:12}}>
      <Avatar size={40} style = {{float: 'right'}} icon = 'user'/>
     <Title level={3} type="warning">Quản lí khách hàng</Title>
     </Header>
        </div>
    )
}

export default Header
