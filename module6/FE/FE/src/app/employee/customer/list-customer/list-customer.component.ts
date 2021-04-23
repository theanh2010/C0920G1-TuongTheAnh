import { Component, OnInit } from '@angular/core';
import {CustomerServiceService} from "../../../customer-service.service";
// Thế Anh
@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.scss']
})
export class ListCustomerComponent implements OnInit {
    customers = [];
    size = 5;
    nameSorting = false;
    pageClicked = 0;
    totalPages = 1;
    pages = [];

  constructor(
    public customerService: CustomerServiceService
) { }

  ngOnInit(): void {
    this.onSubmit(0)
  }

  onSubmit(page) {
    this.customerService.getAllCustomer(page, this.size, this.nameSorting).subscribe(
      data => {
        this.customers = data.content;
        console.log(data);
        this.pageClicked = page;
        this.totalPages = data.totalPages;
        this.pages = Array.apply(null, {length: this.totalPages}).map(Number.call, Number);
      }
    );
  }

  // search(page) {
  //   this.customerService.getAllCustomerByName(this.name , this.size).subscribe(data => {
  //     this.customers = data.content;
  //     console.log(data);
  //     this.pageClicked = page;
  //     this.totalPages = data.totalPages;
  //     this.pages = Array.apply(null, {length: this.totalPages}).map(Number.call, Number);
  //   });
  // }

  onNext() {
    if (this.pageClicked < this.totalPages - 1) {
      this.pageClicked++;
      this.onSubmit(this.pageClicked);
    }
  }

  onPrevious() {
    if (this.pageClicked > 0) {
      this.pageClicked--;
      this.onSubmit(this.pageClicked);
    }
  }

  onFirst() {
    this.pageClicked = 0;
    this.onSubmit(this.pageClicked);
  }

  onLast() {
    this.pageClicked = this.totalPages - 1;
    this.onSubmit(this.pageClicked);
  }

}
