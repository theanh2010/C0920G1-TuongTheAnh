package com.codegym.service.implement.service;

import com.codegym.model.service.RentType;
import com.codegym.reponsitory.service.RentTypeRepository;
import com.codegym.service.service.RentTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeDaoImpl implements RentTypeDao {
    @Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
