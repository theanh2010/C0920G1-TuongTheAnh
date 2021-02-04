package com.codegym.service.employee;

import com.codegym.model.employee.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    List<EducationDegree> findAll();

    EducationDegree findById(Long eduId);
}