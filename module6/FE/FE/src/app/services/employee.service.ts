import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AngularFireDatabase} from "@angular/fire/database";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private URL_API = 'http://localhost:8080/api';

  constructor(
    public http: HttpClient,
    private firebase: AngularFireDatabase
  ) { }

  getAllEmployees(page: number, size: number, textSorting: string): Observable<any>{
    return this.http.get(this.URL_API + '?page=' + page + '&size=' + size + '&textSorting=' + textSorting);
  }

  getAllEmployeeByName(inputSearch: string, size: number): Observable<any>{
    return this.http.get(this.URL_API + '/' + '?inputSearch=' + inputSearch + '&size=' + size);
  }

  addNewEmployee(employee): Observable<any> {
    console.log(employee);
    return this.http.post(this.URL_API, employee);
  }

}
