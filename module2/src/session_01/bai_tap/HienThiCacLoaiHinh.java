package session_01.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("chọn chức năng");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ tam giác vuông");
        System.out.println("3. Vẽ tam giác cân");
        System.out.println("4. Exit");
        int choise = input.nextInt();
        switch (choise){
            case 1 :
                for (int a = 0 ; a <= 5 ; a++){
                    for (int b= 0 ; b <=5 ; b++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2 :
                for (int c =0 ; c < 5 ; c++){
                    for (int d =0 ; d <=c ; d++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                for (int e =0 ; e < 5 ; e++){
                    for (int f = 0 ; f < 5-e ; f++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3 :
                for (int c =0 ; c < 6 ; c++){
                    for (int d =0 ; d <=c ; d++){
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                for (int e =0 ; e < 5 ; e++){
                    for (int f = 0 ; f < 5-e ; f++){
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
        }
    }
}
