import React from 'react'
import ListCustomer from './ListCustomer'

const ListCustomers = ({customers,onDelete}) => {
    return (
            <>
          {customers.map((customer,index) =>(
              <ListCustomer 
              key = {index}
              customer ={customer} 
              onDelete = {onDelete}
             />
          ))}  
        </>
    )
}



export default ListCustomers
