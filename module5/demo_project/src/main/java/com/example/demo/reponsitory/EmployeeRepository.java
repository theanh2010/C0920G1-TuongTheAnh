package com.example.demo.reponsitory;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    @Query(value = "SELECT emp FROM Employee emp WHERE emp.id = :id")
    Employee findUserByStatusAndNameNamedParamsNative(
            @Param("id") Integer id);

    @Query(name = "EmployeeDtoMapping" ,nativeQuery = true)
    List<EmployeeDto> findAllByAll(@Param("name") String name);

}
