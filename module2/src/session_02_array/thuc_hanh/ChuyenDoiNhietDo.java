package session_02_array.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doC ;
        double doF ;
        int choise ;
        do {
            System.out.println("chọn chức năng");
            System.out.println("1. chuyển từ độ C qua độ F");
            System.out.println("2. chuyển từ độ F qua độ C");
            System.out.println("3. exit");
            System.out.println("Enter your choise");
            choise = input.nextInt();
            switch (choise){
                case 1 :
                    System.out.println("nhập độ C");
                    doC =input.nextDouble();
                    System.out.println("C to F " + cToF(doC));
                    break;
                case 2 :
                    System.out.println("nhập độ F");
                    doF = input.nextDouble();
                    System.out.println("F to C " + fToC(doF));
                    break;
                case 3 :
                    System.exit(3);
            }
        }while (choise != 0);
    }
    public static double cToF(double doC){
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double fToC(double doF){
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
