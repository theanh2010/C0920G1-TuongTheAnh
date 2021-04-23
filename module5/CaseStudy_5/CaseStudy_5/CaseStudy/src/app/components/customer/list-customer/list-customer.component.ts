import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../../service/customer.service';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  alert: boolean = false;
  public collection: any = [];

  constructor(private customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.customerService.getCustomerList().subscribe((result) => {
      this.collection = result;
      console.log(this.collection);
    });
  }

  deleteCustomer(customer, i) {
    this.collection.this.collection.splice(i, 1);
    this.customerService.deleteCustomer(customer.id).subscribe((result) => {
      console.log('Data is Deleted Successfull !', result);
      this.alert = true;
    });
  }

  closeAlert() {
    this.alert = false;
  }
}
