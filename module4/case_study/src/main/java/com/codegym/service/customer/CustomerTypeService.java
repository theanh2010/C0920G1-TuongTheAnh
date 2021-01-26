package com.codegym.service.customer;

import com.codegym.model.customer.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(Long idCustomerType);
}
