import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PositionService {

  private URL_API = 'http://localhost:8080/api';

  constructor(
    public http: HttpClient,
  ) { }

  getAllPositions(): Observable<any>{
    return this.http.get(this.URL_API + '/position');
  }
}
