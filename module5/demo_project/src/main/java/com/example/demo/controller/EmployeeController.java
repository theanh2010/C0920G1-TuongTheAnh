package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDto;
import com.example.demo.reponsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping(value = "/employee-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployee(){
        return this.employeeRepository.findAll();
    }


    @GetMapping("/{id}")
    public Employee findOne(@PathVariable("id") int id
    ) {
        return employeeRepository.findUserByStatusAndNameNamedParamsNative(id);
    }

    @PostMapping(value = "/employee-add")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/{id}")
    public Employee editEmployee(@PathVariable("id")Integer id, @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }


}
