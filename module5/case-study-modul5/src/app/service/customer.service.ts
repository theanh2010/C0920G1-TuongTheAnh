import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  URL = 'http://localhost:3000/customer';

  // tslint:disable-next-line:variable-name
  constructor(private _http: HttpClient) {
  }

  getCustomerList() {
    return this._http.get(this.URL);
  }

  addCustomer(data) {
    return this._http.post(this.URL, data);
  }

  deleteCustomer(id) {
    return this._http.delete(this.URL + '/' + id);
  }

  getCurrentData(id) {
    return this._http.get(`${this.URL}/${id}`);
  }

  updateCustomer(id, data) {
    return this._http.put(`${this.URL}/${id}`, data);
  }
}
