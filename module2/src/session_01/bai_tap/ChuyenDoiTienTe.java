package session_01.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền muốn chuyển (USD) :");
        double vnd = input.nextDouble();
        double usd = vnd * 23000;
        System.out.println("số tiền là " + usd);
    }
}
