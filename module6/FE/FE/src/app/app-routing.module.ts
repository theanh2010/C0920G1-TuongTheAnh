import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListEmployeeComponent} from "./employee/admin/list-employee/list-employee.component";
import {CreateEmployeeComponent} from "./employee/admin/create-employee/create-employee.component";

import {CreateCustomerComponent} from "./employee/customer/create-customer/create-customer.component";
import {ListCustomerComponent} from "./employee/customer/list-customer/list-customer.component";
import {CommonModule} from "@angular/common";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HomePageComponent} from "./client/home/home-page/home-page.component";
import {DetailEmployeeComponent} from "./employee/employee/detail-employee/detail-employee.component";
import {ChangePassEmployeeComponent} from "./employee/employee/change-pass-employee/change-pass-employee.component";

const routes: Routes = [
  {path: 'customer-list',component:ListCustomerComponent},
  {path: 'customer-create',component:CreateCustomerComponent},
  //router homepage
  {path: 'home', component: HomePageComponent},
  {path: '', component: HomePageComponent},
  // path cua nhan
  {path: 'employee/detail', component: DetailEmployeeComponent},
  {path: 'employee/changepass', component: ChangePassEmployeeComponent},
// path cua tuan
  {path: 'employee-list', component: ListEmployeeComponent},
  {path: 'employee-create', component: CreateEmployeeComponent},
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes),
    FormsModule,
    ReactiveFormsModule,
  ],
  exports: [RouterModule],
  declarations: [],
})
export class AppRoutingModule { }
