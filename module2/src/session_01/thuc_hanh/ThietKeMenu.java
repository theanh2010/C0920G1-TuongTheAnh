package session_01.thuc_hanh;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("chọn chức năng");
        System.out.println("1.vẽ hình tam giác");
        System.out.println("2.vẽ hình chữ nhật");
        System.out.println("3.vẽ hình vuông");
        System.out.println("0.exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int a = 0; a <= 5; a++) {
                    for (int b = 0; b <= 5; b++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3 :
                for (int c=1 ; c <= 5 ; c++){
                    for (int d = 1 ; d <=5 ; d++){
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 0 :
                System.exit(0);
            default:
                System.out.println("no choice");
            }
        }
    }
