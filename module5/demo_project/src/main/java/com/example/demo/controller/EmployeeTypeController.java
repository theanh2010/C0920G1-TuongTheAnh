package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeType;
import com.example.demo.reponsitory.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class EmployeeTypeController {

    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    @GetMapping(value = "/employee-type", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeType> getEmployeeType(){
        return this.employeeTypeRepository.findAll();
    }
}
