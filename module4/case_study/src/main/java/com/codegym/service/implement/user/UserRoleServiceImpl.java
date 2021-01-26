package com.codegym.service.implement.user;

import com.codegym.model.user.UserRole;

import com.codegym.reponsitory.user.UserRoleRepository;
import com.codegym.service.user.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public void save(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
}
