package _00_test.product_test.validate;

import java.util.Scanner;

public class KiemTra {

    static Scanner input=new Scanner(System.in);

    public static boolean kiemTraSoNguyen(String chon) {
        return chon.matches("^\\d+");
    }
}
