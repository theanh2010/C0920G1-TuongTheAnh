import { Component, OnInit } from '@angular/core';
import { EmployeeService} from '../../../services/employee.service';
import { MatDialog} from '@angular/material/dialog';
import { EmployeeDeleteDialogComponent} from '../employee-delete-dialog/employee-delete-dialog.component';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public employees;
  term: any;
  p:number = 0;
  flag: boolean =false;
  nameSearch: string;
  idSearch: string;
  id: any;
  name: any;
  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.employeeService.getEmployeeSpring().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    });
  }

  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(dataOfEmployee => {
      const dialogRef = this.dialog.open(EmployeeDeleteDialogComponent, {
        width: '500px',
        data: {data1: dataOfEmployee}
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });

  }
  searchByAddress(id: number){
   this.p = 0;
    this.employeeService.searchByAddress(id).subscribe(data =>{
      this.employees = data
    })
  }

  search(): void{
    this.employeeService.findAll(this.nameSearch, this.idSearch).subscribe(data => {
      this.employees = data;
    });
  }

}
