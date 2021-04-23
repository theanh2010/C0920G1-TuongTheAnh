import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerService} from '../../../service/customer.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  alert: boolean = false;
  createCustomer = new FormGroup({
    name: new FormControl(''),
    dateOfBirth: new FormControl(''),
    gender: new FormControl(''),
    idcard: new FormControl(''),
    phoneNumber: new FormControl(''),
    email: new FormControl(''),
    address: new FormControl(''),
    customerType: new FormControl('')
  });
  constructor(private customer:CustomerService) { }

  ngOnInit(): void {
  }
  addCustomer(){
    console.log(this.createCustomer.value);
    // const customer = new Cus(this.addRestaurent.value.name, )
    this.customer.addCustomer(this.createCustomer.value).subscribe((result)=>{
      this.alert = true;
      this.createCustomer.reset({});
      console.log("Get Data From Service", result)
    })
  }
  closeAlert(){
    this.alert = false;
  }

}
