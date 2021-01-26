package com.codegym.service.service;

import com.codegym.model.service.Service;
import com.codegym.model.service.ServiceType;
import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceDao {
    Page<Service> findAll(Pageable pageable);

    Service findById(Long id);

    void save(Service service);

    Service findByCode(String code);

    Page<Service> findByServiceType(ServiceType serviceType, Pageable pageable);

    void deleteById(Long id);

    Page<Service> findByName(String nameService, Pageable pageable);

    Page<Service> findAllByUser(User userMain, Pageable pageable);
}
