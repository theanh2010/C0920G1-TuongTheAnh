import {Users} from "../account/users";
import {Question} from "./question";

export class Answer {
  private id: number;
  private contentAnswer: string;
  private dateAnswer: string;
  private users: Users;
  private question: Question;
}
