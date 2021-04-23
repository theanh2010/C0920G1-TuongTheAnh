import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url = 'http://localhost:3000/employee';

  url2 = 'http://localhost:8080/employee-type';

  url3= 'http://localhost:8080/employee';


  constructor(
    public http: HttpClient
  ) { }

  getEmployeeSpring(): Observable<any>{
    return this.http.get(this.url3 + '-list')
  }


  getAllEmployeesType(): Observable<any>{
    return this.http.get(this.url2);
  }


  addEmployeeSpring(employee): Observable<any>{
    return this.http.post(this.url3 + '-add', employee)
  }
  getEmployeeById(employeeId): Observable<any>{
    return this.http.get(this.url3 + '/' + employeeId);
  }
  deleteEmployee(employeeId: number): Observable<any>{
    return this.http.delete(this.url + '/' + employeeId);
  }

  editEmployee(employee, employeeId): Observable<any>{
    return this.http.put(this.url + '/' + employeeId, employee);
  }

  editEmployeeSpring(employee, employeeId): Observable<any>{
    return this.http.put(this.url3 + '/' + employeeId, employee)
  }

  searchByAddress(id: number) {
    return this.http.get(this.url + '?id_like=' + id);
  }

  searchByNameCus(name: string){
    return this.http.get(this.url2 +  '?name_like=' + name)
  }



  findAll(nameSearch: string, idSearch: string): Observable<any> {
    return this.http.get(this.url + '?name_like=' + nameSearch + '&id_like=' + idSearch);
  }

}
