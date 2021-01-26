package com.codegym.service.user;

import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User findByUsername(String username);

    void registerNewUser(User user);

    Page<User> findAll(Pageable pageable);

    User findById(Long userId);

    void save(User user);
}
