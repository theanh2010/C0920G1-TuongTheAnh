import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {EmployeeService} from '../../../services/employee.service';

@Component({
  selector: 'app-employee-delete-dialog',
  templateUrl: './employee-delete-dialog.component.html',
  styleUrls: ['./employee-delete-dialog.component.css']
})
export class EmployeeDeleteDialogComponent implements OnInit {
  public employeeOfId;
  public employeeId;
  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteDialogComponent>,
    public employeeService: EmployeeService,
    @Inject(MAT_DIALOG_DATA) public data: any
  ) { }

  ngOnInit(): void {
    console.log(this.data.data1);
    this.employeeOfId = this.data.data1.id;
    this.employeeId = this.data.data1.id;
  }

  deleteEmployee(){
    this.employeeService.deleteEmployee(this.employeeId).subscribe(data => {
      this.dialogRef.close();
      setTimeout(function() {
        alert('xóa thành công');
      }, 500);
    });
  }
}
