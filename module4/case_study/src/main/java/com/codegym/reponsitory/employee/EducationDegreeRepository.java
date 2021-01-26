package com.codegym.reponsitory.employee;

import com.codegym.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Long> {
}
