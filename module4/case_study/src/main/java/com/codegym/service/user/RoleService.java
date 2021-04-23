package com.codegym.service.user;

import com.codegym.model.user.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role> findAll();

    Role findById(Long roleId);
}
