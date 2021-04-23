package com.codegym.reponsitory.service;

import com.codegym.model.service.Service;
import com.codegym.model.service.ServiceType;
import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    Service findByCode(String code);

    Page<Service> findAllByServiceType(ServiceType serviceType, Pageable pageable);

    Page<Service> findAllByNameContaining(String name, Pageable pageable);

    Page<Service> findAllByUser(User user, Pageable pageable);
}
