import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { Ng2SearchPipeModule} from 'ng2-search-filter';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NgxPaginationModule} from 'ngx-pagination';
import {MatDialogModule} from '@angular/material/dialog';
import { NgxSortableModule } from 'ngx-sortable'

import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import { EmployeeAddComponent } from './components/employee/employee-add/employee-add.component';
import { EmployeeDeleteDialogComponent } from './components/employee/employee-delete-dialog/employee-delete-dialog.component';
import { EmployeeEditComponent } from './components/employee/employee-edit/employee-edit.component';

const routes: Routes = [
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-add', component: EmployeeAddComponent},
  {path: 'employee-edit/:id', component: EmployeeEditComponent}

];


@NgModule({
  declarations: [EmployeeAddComponent, EmployeeDeleteDialogComponent, EmployeeEditComponent],
  imports: [
    RouterModule.forRoot(routes),
    CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    MatDialogModule,
    ReactiveFormsModule,
    NgxSortableModule
  ],

  exports: [RouterModule]
})
export class AppRoutingModule { }
