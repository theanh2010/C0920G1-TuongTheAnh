import {Component, OnInit} from '@angular/core';
import {EmployeeService} from "../../../services/employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.scss']
})
export class ListEmployeeComponent implements OnInit {
  searchInput: string;
  public employees = [];
  textSorting = "";
  size = 5;
  pageClicked = 0;
  pages = [];
  totalPages = 1;

  constructor(
    public employeeService: EmployeeService,
    public router: Router
  ) {
  }

  ngOnInit(): void {
    this.onSubmit(0);
  }

  onSubmit(page) {
    this.employeeService.getAllEmployees(page, this.size, this.textSorting).subscribe(
      data => {
        this.employees = data.content;
        console.log(data);
        this.pageClicked = page;
        this.totalPages = data.totalPages;
        this.pages = Array.apply(null, {length: this.totalPages}).map(Number.call, Number);
      }
    );
  }

  search(page) {
    this.employeeService.getAllEmployeeByName(this.searchInput , this.size).subscribe(data => {
      this.employees = data.content;
      console.log(data);
      this.pageClicked = page;
      this.totalPages = data.totalPages;
      this.pages = Array.apply(null, {length: this.totalPages}).map(Number.call, Number);
    });
  }

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

  onSortingChange(value) {
    if (this.textSorting == "") {
      this.textSorting = value;
    } else {
      this.textSorting = "";
    }
    this.ngOnInit();
  }
}
