package com.codegym.reponsitory.employee;

import com.codegym.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Long> {
}
