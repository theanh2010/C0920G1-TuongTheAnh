package com.codegym.service.implement.service;

import com.codegym.model.service.Service;
import com.codegym.model.service.ServiceType;
import com.codegym.model.user.User;
import com.codegym.reponsitory.service.ServiceRepository;
import com.codegym.service.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service
public class ServiceDaoImpl implements ServiceDao {

    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Service findById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public Service findByCode(String code) {
        return serviceRepository.findByCode(code);
    }

    @Override
    public Page<Service> findByServiceType(ServiceType serviceType, Pageable pageable) {
        return serviceRepository.findAllByServiceType(serviceType, pageable);
    }

    @Override
    public void deleteById(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Page<Service> findByName(String nameService, Pageable pageable) {
        return serviceRepository.findAllByNameContaining(nameService, pageable);
    }

    @Override
    public Page<Service> findAllByUser(User userMain, Pageable pageable) {
        return serviceRepository.findAllByUser(userMain, pageable);
    }
}
