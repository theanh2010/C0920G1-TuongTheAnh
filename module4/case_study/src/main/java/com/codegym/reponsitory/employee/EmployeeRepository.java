package com.codegym.reponsitory.employee;

import com.codegym.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findByCode(String code);

    Employee findByEmail (String email);

    Employee findByPhone (String numberPhone);

    Employee findByIdCard(String idCard);
}
