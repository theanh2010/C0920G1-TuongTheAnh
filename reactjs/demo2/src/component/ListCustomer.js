import React from 'react'
import { Table, Tag, Space } from 'antd';
import {DeleteFilled,EditFilled } from '@ant-design/icons';



const listCustomer = ({customer, onDelete}) => {
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
          <a>< DeleteFilled  style ={{ color :'red' , cursor: 'pointer' }}
            onClick = {() => window.confirm("bạn có chắc muốn xóa ")  && onDelete(customer.id)} /></a>
        </Space>
      ),
    },
  ];
  
  const data = [];
  for (let i = 0 ; i <5 ; i++){
      data.push({
          id : Math.floor(Math.random() * 10* (i+1)),
          key : i,
          name :`Thế Anh ${ Math.floor(Math.random() * 10* (i+1))}`,
          age : Math.floor(Math.random() * 10* (i+1)),
          address: `Đà Nẵng ${ Math.floor(Math.random() * 10* (i+1))}`,
          tags: ['nice', 'developer','loser'],

      })
  }
  
 
    return (
        <div>
            <Table columns={columns} dataSource={data} pagination ={pagination}
            />
        </div>
    )
}

export default listCustomer
