package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
