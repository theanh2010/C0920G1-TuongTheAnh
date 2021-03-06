import React from 'react'
import { Table, Tag, Space } from 'antd';
import {DeleteFilled,EditFilled } from '@ant-design/icons'

const CustomerTable = (props) => {
  console.log(props)
  // const { id, name} = props.customer;

    const pagination = {
        showSizeChanger: true,
        pageSizeOptions: [5, 10, 15, 20, 25]
    
      };
    
const columns = [
    {
        title: 'ID',
        dataIndex: 'id',
        key: 'id',
        sorter: {
            compare: (a, b) => a.id - b.id,
            multiple: 3,
          },
      },
    {
      title: 'Name',
      dataIndex: 'name',
      key: 'name',
      render: text => <a>{text}</a>,
    },
    {
      title: 'Age',
      dataIndex: 'age',
      key: 'age',
    },
    {
      title: 'Address',
      dataIndex: 'address',
      key: 'address',
      sorter: {
        compare: (a, b) => a.address - b.address,
        multiple: 1,
      },
    },
    {
      title: 'Tags',
      key: 'tags',
      dataIndex: 'tags',
      render: tags => (
        <>
          {tags.map(tag => {
            let color = tag.length > 5 ? 'geekblue' : 'green';
            if (tag === 'loser') {
              color = 'volcano';
            }
            return (
              <Tag color={color} key={tag}>
                {tag.toUpperCase()}
              </Tag>
            );
          })}
        </>
      ),
    },
    {
      title: 'Action',
      key: 'action',
      render: (text, record) => (
        <Space size="middle">
          <a><EditFilled /></a>
          <a>< DeleteFilled  style ={{ color :'red' , cursor: 'pointer' }} /></a>
        </Space>
      ),
    },
  ];
  
  const data = []
 
  
 
    return (
        <div>
            <Table columns={columns} dataSource={data} pagination ={pagination}
            />
            
        </div>
    )
}

export default CustomerTable
