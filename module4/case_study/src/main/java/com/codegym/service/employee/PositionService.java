package com.codegym.service.employee;

import com.codegym.model.employee.EducationDegree;
import com.codegym.model.employee.Position;

import java.util.List;

public interface PositionService {
    List<Position> findAll();

    Position findById(Long posId);
}
