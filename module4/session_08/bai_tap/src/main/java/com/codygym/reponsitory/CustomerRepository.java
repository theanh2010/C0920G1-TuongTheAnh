package com.codygym.reponsitory;

import com.codygym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//    Page<Customer> findByNameContainingAndGender(String name, int gender, Pageable pageable);
//
//    Page<Customer> findByNameContainingAndIdGreaterThanEqual(String name, int id, Pageable pageable);
//
//    @Query("select s from Customer s where s.name =:input and s.id >=2")
//    Page<Student> findByName2(@Param("input") String name, Pageable pageable);
}
