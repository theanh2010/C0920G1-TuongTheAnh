import {ContractDetail} from "./contract-detail";
import {StatusAccident} from "./status-accident";

export class Accident {
  private id: number;
  private requestDay: string;
  private reason: string;
  private img: string;
  private notApprovedReason: string;
  private money: string;
  private contractDetail: ContractDetail;
  private statusAccident: StatusAccident;
}
