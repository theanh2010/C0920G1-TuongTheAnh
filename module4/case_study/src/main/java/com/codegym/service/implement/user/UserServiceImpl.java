package com.codegym.service.implement.user;


import com.codegym.model.user.User;
import com.codegym.model.user.UserRole;

import com.codegym.reponsitory.user.RoleRepository;
import com.codegym.reponsitory.user.UserRepository;
import com.codegym.reponsitory.user.UserRoleRepository;
import com.codegym.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void registerNewUser(User user) {

//        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
//
//        userRepository.save(user);
//
//        UserRole userRole = new UserRole();
//        userRole.setUser(user);
//        userRole.setRole(roleRepository.findById((long)1).get());
//
//        userRoleRepository.save(userRole);

    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}