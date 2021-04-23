import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {
  private url_customer = 'http://localhost:8080/customers';
  private url_car = 'http://localhost:8080/cars';

  constructor(
    public http: HttpClient
  ) { }


  getAllCustomer(page: number, size: number, nameSorting: boolean): Observable<any>{
    return this.http.get(this.url_customer + '?page=' + page + '&size=' + size + '&nameSorting=' + nameSorting);
  }

  getCar(page: number){
    return this.http.get(this.url_car);
  }

  getCustomerById(id){
    return this.http.get(this.url_customer + id)
  }

  getAllCustomerByName(name: string, size: number): Observable<any>{
    return this.http.get(this.url_customer + '/' + '?name=' + name + '&size=' + size);
  }


  // addNewEmployee(customer): Observable<Customer> {
  //   return this.http.post<Customer>(this.url_customer + '/create', customer);
  // }


}
