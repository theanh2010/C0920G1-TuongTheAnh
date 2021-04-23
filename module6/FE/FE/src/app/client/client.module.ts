import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateCarComponent } from './car/create-car/create-car.component';
import { ListCarComponent } from './car/list-car/list-car.component';
import { CreateCustomerComponent } from './customer/create-customer/create-customer.component';
import { EditCustomerComponent } from './customer/edit-customer/edit-customer.component';
import { CreateContractComponent } from './contract/create-contract/create-contract.component';
import { ListContractComponent } from './contract/list-contract/list-contract.component';
import { CreateAccidentComponent } from './accident/create-accident/create-accident.component';
import { ListAccidentComponent } from './accident/list-accident/list-accident.component';
import { HomePageComponent } from './home/home-page/home-page.component';



@NgModule({
  declarations: [CreateCarComponent,
    ListCarComponent,
    CreateCustomerComponent,
    EditCustomerComponent,
    CreateContractComponent,
    ListContractComponent,
    CreateAccidentComponent,
    ListAccidentComponent,
    HomePageComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ClientModule { }
