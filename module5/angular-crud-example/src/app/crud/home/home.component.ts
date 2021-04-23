import { Component, OnInit } from '@angular/core';
import {CrudService} from '../crud.service';
import {Products} from '../product';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  products: Products[] = [];

  constructor(public crudService: CrudService) { }

  ngOnInit(): void {
    this.crudService.getAll().subscribe((value: Products[]) => {
      console.log(value);
      this.products = value;
    });
  }

}
