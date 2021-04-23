import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../../model/employee.model';

const headerOption = {
  headers: new HttpHeaders({'Content-Type': 'application/json' })
};
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url = 'http://localhost:3000/Employee';

  currentEmployee: Employee = {
    id: null,
    firstName: 'a',
    lastName: '',
    code: '',
    designation: '',
    contact: null,
    address: ''
  };

  constructor(
    private http: HttpClient
  ) {
  }

  getAllEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.url, headerOption);
  }

  deleteEmployee(id: number): Observable<Employee> {
    return this.http.delete<Employee>(this.url + '/' + id, headerOption);
  }

  createEmployee(emp: Employee): Observable<Employee> {
    return this.http.post<Employee>(this.url, emp, headerOption);
  }

  updateEmployee(emp: Employee): Observable<Employee> {
    return this.http.post<Employee>(this.url + '/' + emp.id, emp, headerOption);
  }

}
