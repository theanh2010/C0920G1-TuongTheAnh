package session_01.thuc_hanh;

import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng muốn đếm ngày");
        int month =scanner.nextInt();
        System.out.println("nhập năm muốn kiểm tra");
        int year = scanner.nextInt();
        switch (month){
            case 2 :
                if (year % 400 == 0) {
                    System.out.println("tháng 2 năm " + year +" là năm nhuận có 29 ngày");
                }else if (year % 4 == 0 && year % 100 != 0){
                    System.out.println("tháng 2 năm " + year +" là năm nhuận có 29 ngày");
                }else
                    System.out.println("tháng 2 năm " + year +" không phải là năm nhuận có 28 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("tháng "+ month + " có 30 ngày");
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("tháng "+ month +" có 31 ngày");
                break;
        }
    }
}
