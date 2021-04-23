package com.codegym.service.customer;

import com.codegym.entity.customer.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void save(Customer customer);

    Customer findById(long id);

    List<Customer> getAllCustomer();

}
