import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms';
import { EmployeeService} from '../../../services/employee.service';
import { Router} from '@angular/router';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  public formAddNewEmployee: FormGroup;
  employeeType: any = [];

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.getEmployeeType();
    this.formAddNewEmployee = this.formBuilder.group({
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      address: ['', [Validators.required]],
      phone: ['', [Validators.required]],
      idCard: ['', [Validators.required]],
      employeeType:['']
    });
  }

  addNewEmployee() {
    // console.log(this.formAddNewEmployee.value);
    this.employeeService.addEmployeeSpring(this.formAddNewEmployee.value).subscribe(data => {
     this.router.navigateByUrl('employee-list');
      setTimeout(function() {
        alert('thêm mới thành công');
      }, 500);
    });
  }

  getEmployeeType() {
    this.employeeService.getAllEmployeesType().subscribe(data =>{
      this.employeeType=data
    })
  }
}
