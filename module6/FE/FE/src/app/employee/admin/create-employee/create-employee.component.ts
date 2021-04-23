import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../services/employee.service";
import {Router} from "@angular/router";
import {AngularFireStorage} from "@angular/fire/storage";
import {finalize} from "rxjs/operators";
import {PositionService} from "../../../services/position.service";
import {UsersService} from "../../../services/users.service";
import {Observable} from "rxjs";

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.scss']
})
export class CreateEmployeeComponent implements OnInit {

  public formCreateEmployee: FormGroup;
  imgSrc = '/assets/img/nhan/images.jpg';
  selectedImage: any = null;
  public positions: any[];
  public users: any[];
  checkUserExist: boolean;

  constructor(
    public fb: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
    private storage: AngularFireStorage,
    public positionService: PositionService,
    public usersService: UsersService
  ) { }

  ngOnInit(): void {
    this.getAllPositions();
    this.getAllUsers();
    this.formCreateEmployee = this.fb.group({
      name: new FormControl('', [Validators.required]),
      dateOfBirth: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required]),
      address: new FormControl('', [Validators.required]),
      city: new FormControl('', [Validators.required]),
      img: new FormControl('', [Validators.required]),
      users: new FormControl('', [Validators.required]),
      password: this.fb.group({
        newPassword: ['',Validators.required],
        confirmPassword: ['',Validators.required]
      }, {validators: this.comparePassword}),
      position: new FormControl('',[Validators.required])
    });
  }

  addNewEmployee(formValue){
    this.usersService.checkUser(formValue.users).subscribe(data => {
      console.log(data);
      this.checkUserExist = data;
      if (this.checkUserExist === true) {
        this.usersService.getNewUser(formValue.users, formValue.password.newPassword).subscribe(data => {
          formValue.users = data;
          const filePath = `employee/${this.selectedImage.name.split('.').slice(0, -1).join('.')}_${new Date().getTime()}`;
          const fileRef = this.storage.ref(filePath);
          this.storage.upload(filePath, this.selectedImage).snapshotChanges().pipe(
            finalize(() => {
              fileRef.getDownloadURL().subscribe((url) => {
                formValue.img = url;
                this.employeeService.addNewEmployee(formValue).subscribe(data => {
                  this.router.navigateByUrl('employee-list');
                });
              });
            })
          ).subscribe();
        })
      } else {
        this.ngOnInit();
      }
    })
  }

  showPreview(event: any){
    if (event.target.files && event.target.files[0]){
      const reader = new FileReader();
      reader.onload = (e: any) => this.imgSrc = e.target.result;
      reader.readAsDataURL(event.target.files[0]);
      this.selectedImage = event.target.files[0];
    } else {
      this.imgSrc = '/assets/img/images.jpg';
      this.selectedImage = null;
    }
  }

  private getAllPositions() {
    this.positionService.getAllPositions().subscribe(data => {
      this.positions = data;
    });
  }

  private getAllUsers() {
    this.usersService.getAllUsers().subscribe(data => {
      this.users = data;
      console.log(this.users)
    });
  }

  comparePassword(c: AbstractControl) {
    const value = c.value;
    return (value.newPassword === value.confirmPassword) ? null : {
      passwordnotmatch: true
    };
  }
}
