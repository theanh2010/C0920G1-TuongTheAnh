import {EmployeeType} from './employee-type';

export class Employee {
  id: number;
  name: string;
  birthday: string;
  gender: string;
  idCard: string;
  phone: string;
  address:string;
  employeeType: EmployeeType;


  constructor(id: number, name: string, birthday: string, gender: string, idCard: string, phone: string, address: string, employeeType: EmployeeType) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
    this.idCard = idCard;
    this.phone = phone;
    this.address = address;
    this.employeeType = employeeType;
  }
}
