import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute} from '@angular/router';
import {CustomerService} from '../../../service/customer.service';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
  alert: boolean = false;
  editCustomer = new FormGroup({
    name: new FormControl(''),
    dateOfBirth: new FormControl(''),
    gender: new FormControl(''),
    idcard: new FormControl(''),
    phoneNumber: new FormControl(''),
    email: new FormControl(''),
    address: new FormControl(''),
    customerType: new FormControl('')
  });

  constructor(
    private customer: CustomerService,
    private router: ActivatedRoute
  ) {
  }


  ngOnInit(): void {
    console.log(this.router.snapshot.params.id);
    this.customer.getCurrentData(this.router.snapshot.params.id).subscribe((result) => {
      console.log(result);
      this.editCustomer.setValue(result);
      // this.editCustomer = new FormGroup({
      //   name: new FormControl(result['name']),
      //   dateOfBirth: new FormControl(result['dateOfBirth']),
      //   gender: new FormControl(result['gender']),
      //   idcard: new FormControl(result['idcard']),
      //   phoneNumber: new FormControl(result['phoneNumber']),
      //   email: new FormControl(result['email']),
      //   address: new FormControl(result['address']),
      //   customerType: new FormControl(result['address']),
      // });
    });
  }

  updateCustomer() {
    this.customer.updateCustomer(this.router.snapshot.params.id, this.editCustomer.value).subscribe((result) => {
      console.log(result, 'data updated successfull');
      this.alert = true;
    });
  }

  closeAlert() {
    this.alert = false;
  }
}
