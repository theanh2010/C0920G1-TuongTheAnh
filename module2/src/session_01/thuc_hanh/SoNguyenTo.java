package session_01.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int number = input.nextInt();
        boolean check = true;
//       SoNguyenTo nguyenTo=new SoNguyenTo();
        System.out.println(check(number));
    }
    public static boolean check(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            return true;
        } else {
            return false;
        }

    }
}
