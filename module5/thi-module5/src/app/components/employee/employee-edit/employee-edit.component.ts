import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators, AbstractControl} from '@angular/forms';
import {EmployeeService} from '../../../services/employee.service';
import {Router, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {

  public formEditEmployee: FormGroup;
  employeeType: any = [];

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) {
  }

  ngOnInit(): void {
    const employeeId = Number(this.activatedRoute.snapshot.params.id);
    this.getEmployeeType();
    this.formEditEmployee = this.formBuilder.group({
      id: [''],
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      address: ['', [Validators.required]],
      phone: ['', [Validators.required]],
      idCard: ['', [Validators.required]],
      employeeType:['']
    });
      this.employeeService.getEmployeeById(employeeId).subscribe(data => {
        this.formEditEmployee.patchValue(data);
      });
  }

  // editEmployee() {
  //   this.employeeService.editEmployeeSpring(this.formEditEmployee.value).subscribe(data => {
  //     this.router.navigateByUrl('employee-list');
  //     setTimeout(function() {
  //       alert('sửa thành công');
  //     }, 500);
  //   });
  // }
  getEmployeeType() {
    this.employeeService.getAllEmployeesType().subscribe(data =>{
      this.employeeType=data
    })
  }

}
