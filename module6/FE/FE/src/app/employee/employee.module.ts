import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateCustomerComponent } from './customer/create-customer/create-customer.component';
import { ListCustomerComponent } from './customer/list-customer/list-customer.component';
import { DetailCustomerComponent } from './customer/detail-customer/detail-customer.component';
import { EditCustomerComponent } from './customer/edit-customer/edit-customer.component';
import { DeleteCustomerComponent } from './customer/delete-customer/delete-customer.component';
import { ListCarComponent } from './car/list-car/list-car.component';
import { CreateCarComponent } from './car/create-car/create-car.component';
import { EditCarComponent } from './car/edit-car/edit-car.component';
import { CreateContractComponent } from './contract/create-contract/create-contract.component';
import { EditContractComponent } from './contract/edit-contract/edit-contract.component';
import { DeleteContractComponent } from './contract/delete-contract/delete-contract.component';
import { ListContractComponent } from './contract/list-contract/list-contract.component';
import { EditEmployeeComponent } from './admin/edit-employee/edit-employee.component';
import { CreateEmployeeComponent } from './admin/create-employee/create-employee.component';
import { ListEmployeeComponent } from './admin/list-employee/list-employee.component';
import { DeleteEmployeeComponent } from './admin/delete-employee/delete-employee.component';
import { ListAccidentComponent } from './accident/list-accident/list-accident.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";
import {MatSelectModule} from "@angular/material/select";

import { DetailEmployeeComponent } from './employee/detail-employee/detail-employee.component';
import { UpdateEmployeeComponent } from './employee/update-employee/update-employee.component';
import { ChangePassEmployeeComponent } from './employee/change-pass-employee/change-pass-employee.component';

@NgModule({
  declarations: [
    CreateCustomerComponent,
    ListCustomerComponent,
    DetailCustomerComponent,
    EditCustomerComponent,
    DeleteCustomerComponent,
    ListCarComponent,
    CreateCarComponent,
    EditCarComponent,
    CreateContractComponent,
    EditContractComponent,
    DeleteContractComponent,
    ListContractComponent,
    EditEmployeeComponent,
    CreateEmployeeComponent,
    ListEmployeeComponent,
    DeleteEmployeeComponent,
    ListAccidentComponent,
    DetailEmployeeComponent,
    UpdateEmployeeComponent,
    ChangePassEmployeeComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule,
    ReactiveFormsModule,
    MatSelectModule,
  ]
})
export class EmployeeModule { }
