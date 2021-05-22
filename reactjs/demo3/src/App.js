import './App.css';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

import React, { useState, useEffect } from "react";
import FooterCustomer from './component/FooterCustomer'
import { Typography  } from 'antd';
import api from './api/customer';
import AddCustomer from './component/AddCustomer';
import CustomerList from './component/CustomerList';
import CustomerDetail  from './component/CustomerDetail';
import EditCustomer from './component/EditCustomer'; 
import HeaderCustomer from './component/HeaderCustomer'

const { Title } = Typography;


function App() {
  const [customers,setCustomer] = useState([])
   
  const retrieveCustomers = async () => {
    const response = await api.get("/customers");
    console.log(response.data)
    return  response.data
  }

   useEffect(() =>{
     const getAllCustomers = async () => {
       const allCustomers = await retrieveCustomers();
       if (allCustomers) setCustomer(allCustomers);
     };

     getAllCustomers();

   },[]);

   useEffect(() => {
    //localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(contacts));
  }, [customers]);
   
  return (
    <div className="App">
      <Router>
        <HeaderCustomer/>
        <Title>Danh sách khách hàng</Title>
        <Switch>
          <Route
            path="/"
            exact
            render={(props) => (
              <CustomerList
                {...props}
                customers={customers}
                // getCustomerId={removeCustomerHandler}
              />
            )}
          />
          {/* <Route
            path="/add"
            render={(props) => (
              <AddCustomer {...props} addCustomerHandler={addCustomerHandler} />
            )}
          />

          <Route
            path="/edit"
            render={(props) => (
              <EditCustomer
                {...props}
                updateCustomerHandler={updateCustomerHandler}
              />
            )}
          /> */}

          <Route path="/customer/:id" component={CustomerDetail} />
        </Switch>
        <FooterCustomer/>
      </Router>
    </div>
  );
}

export default App;
