import React from 'react'
import { Layout, Typography  } from 'antd';
const { Footer } = Layout;



const FooterCustomer = () => {
    return (
        <div>
            <Footer style={{background: '#fff', padding: 24, minHeight: 580, textAlign: 'center' }}>Ant Design ©2018 Created by Ant UED</Footer>
        </div>
    )
}

export default FooterCustomer
