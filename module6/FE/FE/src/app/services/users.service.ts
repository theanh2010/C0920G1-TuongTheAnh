import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private URL_API = 'http://localhost:8080/api';

  constructor(
    public http: HttpClient,
  ) { }

  getAllUsers(): Observable<any>{
    return this.http.get(this.URL_API + '/users');
  }

  getNewUser(user: string, password: string): Observable<any> {
    return this.http.get(this.URL_API + '/user' + '?user='+ user + '&password=' + password);
  }

  checkUser(user: string): Observable<boolean> {
    return this.http.get<boolean>(this.URL_API + '/check-user' + '?user='+ user);
  }
}
