package com.codygym.service;

import com.codygym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface CustomerService {
    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void update(Customer customer);

    Customer findById(int id);

//    Page<Customer> findByInputText(String inputSearch, Pageable pageable);
}
