import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {Products} from './product';
import {catchError} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CrudService {
  private apiServer = 'http://localhost:3000';
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private httpClient: HttpClient) { }
  errorHandler(error) {
    let errorMessage: string;
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

  create(product): Observable<Products>{
    return this.httpClient.post<Products>(this.apiServer + '/products', JSON.stringify(product), this.httpOptions)
      .pipe(catchError(this.errorHandler));
  }
  getById(id): Observable<Products>{
    return this.httpClient.get<Products>(this.apiServer + '/products/' + id)
      .pipe(
        catchError(this.errorHandler)
      );
  }
  getAll(): Observable<Products[]> {
    return this.httpClient.get<Products[]>(this.apiServer + '/products/')
      .pipe(
        catchError(this.errorHandler)
      );
  }
  update(id, product): Observable<Products> {
    return this.httpClient.put<Products>(this.apiServer + '/products/' + id, JSON.stringify(product), this.httpOptions)
      .pipe(
        catchError(this.errorHandler)
      );
  }
  delete(id){
    return this.httpClient.delete<Products>(this.apiServer + '/products/' + id,  this.httpOptions)
      .pipe(
        catchError(this.errorHandler)
      );
  }



}
