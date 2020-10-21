package session_01.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số a ");
        int a = input.nextInt();
        System.out.println("nhập số b ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b){
            if ( a > b ){
                a = a-b;
            }else {
                b = b -a;
            }
        }
        System.out.println("ước chung lớn nhất là " + a);
    }
}
