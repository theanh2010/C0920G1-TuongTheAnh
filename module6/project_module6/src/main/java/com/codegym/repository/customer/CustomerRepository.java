package com.codegym.repository.customer;

import com.codegym.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
//Thế anh
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT customer FROM Customer customer")
    List<Customer> findAll();

    @Query("SELECT customer from Customer customer where customer.id = ?1")
    Customer findById(long id);


}
