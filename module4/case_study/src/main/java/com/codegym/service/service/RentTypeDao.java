package com.codegym.service.service;

import com.codegym.model.service.RentType;

import java.util.List;

public interface RentTypeDao {
    List<RentType> findAll();
}
