package session_01.thuc_hanh;

import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        SoNguyenTo soNguyenTo=new SoNguyenTo();
        System.out.println(soNguyenTo.check(number));
    }
}
