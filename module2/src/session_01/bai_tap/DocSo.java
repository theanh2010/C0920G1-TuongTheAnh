package session_01.bai_tap;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số ");
        int number = input.nextInt();
        int donVi = number % 10;
        int hangTram = number/100;
        int hangChuc = (number - hangTram*100 - donVi)/10 ;
    switch (number){
        case 1 :
            System.out.println("một");
            break;
        case 2 :
            System.out.println("hai");
            break;
        case 3 :
            System.out.println("ba");
            break;
        case 4 :
            System.out.println("bốn");
            break;
        case 5 :
            System.out.println("năm");
            break;
        case 6 :
            System.out.println("sáu");
            break;
        case 7 :
            System.out.println("bảy");
            break;
        case 8 :
            System.out.println("tám");
            break;
        case 9 :
            System.out.println("chín");
            break;
    }
    hangTram(hangTram);
    chuc(hangChuc);
    donVi(donVi);

    }
    public static void chuc(int number) {
        String chucStr="";
        switch (number){
            case 1 :
                chucStr = "mười";
                break;
            case 2 :
                chucStr = "hai mươi";
                break;
            case 3 :
                chucStr = "ba mươi";
                break;
            case 4 :
                System.out.println("bốn");
                break;
            case 5 :
                System.out.print("năm mươi ");
                break;
            case 6 :
                System.out.println("sáu");
                break;
            case 7 :
                System.out.println("bảy");
                break;
            case 8 :
                System.out.println("tám");
                break;
            case 9 :
                System.out.println("chín");
                break;
        }
    }
    public static void donVi(int number) {
        String chucStr="";
        switch (number){
            case 1 :
                chucStr = "mười";
                break;
            case 2 :
                chucStr = "hai mươi";
                break;
            case 3 :
                chucStr = "ba mươi";
                break;
            case 4 :
                System.out.println("bốn");
                break;
            case 5 :
                System.out.print("năm trăm");
                break;
            case 6 :
                System.out.println("sáu");
                break;
            case 7 :
                System.out.println("bảy");
                break;
            case 8 :
                System.out.println("tám");
                break;
            case 9 :
                System.out.println("chín");
                break;
        }
    }
    public static void hangTram(int number) {
        String chucStr="";
        switch (number){
            case 1 :
                chucStr = "mười";
                break;
            case 2 :
                chucStr = "hai mươi";
                break;
            case 3 :
                chucStr = "ba mươi";
                break;
            case 4 :
                System.out.println("bốn");
                break;
            case 5 :
                System.out.println("năm");
                break;
            case 6 :
                System.out.println("sáu");
                break;
            case 7 :
                System.out.println("bảy");
                break;
            case 8 :
                System.out.println("tám");
                break;
            case 9 :
                System.out.println("chín");
                break;
        }
    }
}
