import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../../shared/employee.service';
import {Employee} from '../../../model/employee.model';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  allEmployee: Employee[];

  constructor(
    private employeeService: EmployeeService
  ) {
  }

  ngOnInit(): void {
    this.getAllEmployee();
  }

  getAllEmployee() {
    this.employeeService.getAllEmployees().subscribe(
      (data: Employee[]) => {
        this.allEmployee = data;
      });
  }

  deleteEmployee(id: number){
    console.log(id);
    this.employeeService.deleteEmployee(id).subscribe(
      (data: Employee) => {
        this.getAllEmployee();
      });
  }

  edit(emp: Employee) {
    this.employeeService.currentEmployee = Object.assign({}, emp);
  }
}

