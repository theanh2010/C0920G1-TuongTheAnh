import React from 'react'
import { Link } from 'react-router-dom'
import CustomerTable from './CustomerTable'


const CustomerList = (props) => {

    const deleteCustomerHandler = (id) => {
        this.props.getCustomerId(id)
    }

    const renderCustomerList = props.customers.map((customer) => {
        return (
            <CustomerTable
                customer ={customer}
                clickHander = {deleteCustomerHandler}
                key = {customer.id}
            />    
        );
    });
    return (
        <div>
         <h2>
             Customer List
             <Link to = "/add">
             <button>Add Customer</button>    
             </Link>
             </h2>
             <div>{renderCustomerList}</div>   
        </div>
    )
}

export default CustomerList
