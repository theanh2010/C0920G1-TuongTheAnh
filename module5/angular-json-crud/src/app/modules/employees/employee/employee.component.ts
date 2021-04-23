import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/model/employee.model';
import {EmployeeService} from '../../shared/employee.service';


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employee: Employee;
  constructor(
    private employeeService: EmployeeService,

  ) { }

  ngOnInit() {
      this.employee = this.employeeService.currentEmployee;

  }

  createOrUpdateEmployee(currentEmployee: Employee) {
    if (currentEmployee.id === null) {
      this.createEmployee(currentEmployee);
    } else {
      this.updateEmployee(currentEmployee);
    }
  }

  createEmployee(emp: Employee) {
    this.employeeService.createEmployee(emp).subscribe(
      (result: Employee) => {
        this.employeeService.getAllEmployees();
        this.clearEmployee();
      });
  }

  updateEmployee(emp: Employee) {
    this.employeeService.updateEmployee(emp).subscribe(
      (result: Employee) => {
        this.employeeService.getAllEmployees();
        this.clearEmployee();
      });
  }

  clearEmployee() {
    this.employeeService.currentEmployee = {
      id: null,
      firstName: '',
      lastName: '',
      designation: '',
      contact: null,
      address: '',
      code: ''
    };
  }
}
