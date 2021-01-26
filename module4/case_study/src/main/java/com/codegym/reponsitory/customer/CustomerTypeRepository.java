package com.codegym.reponsitory.customer;

import com.codegym.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType,Long> {
}
