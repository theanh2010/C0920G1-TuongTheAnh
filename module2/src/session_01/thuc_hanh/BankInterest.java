package session_01.thuc_hanh;

import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền muốn gửi :");
        double money = input.nextDouble();
        System.out.println("nhập số tháng cần gửi :");
        int month = input.nextInt();
        System.out.println("nhập lãi suất muốn gửi :");
        double rate = input.nextDouble();
        double interestMoney = 0;
        for (int i =0 ; i < month ; i++){
            interestMoney += money * (rate / 100 ) / 12 * month;
            System.out.println("số tiền lãi là " + interestMoney);
        }
    }
}
