package com.codegym.reponsitory.user;

import com.codegym.model.user.User;
import com.codegym.model.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findAllByUser(User user);
}
