package com.codegym.service.implement.customer;

import com.codegym.model.customer.CustomerType;
import com.codegym.reponsitory.customer.CustomerTypeRepository;
import com.codegym.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Autowired
    CustomerTypeRepository customerTypeRepository;


    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(Long idCustomerType) {
        return customerTypeRepository.findById(idCustomerType).orElse(null);
    }
}
