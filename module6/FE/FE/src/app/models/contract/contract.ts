import {Car} from "../customer/car";
import {Employee} from "../employee/employee";
import { Product } from '../product/product';

export class Contract {
  private id: number;
  private startDate: string;
  private endDate: string;
  private uses: string;
  private statusPay: string;
  private statusApproval: string;
  private paymentOption: string;
  private product: Product;
  private employee: Employee;
  private car: Car;
}
