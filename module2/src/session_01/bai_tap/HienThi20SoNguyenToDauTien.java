package session_01.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println(" nhập số nguyên tố cần tìm");
        Scanner input = new Scanner(System.in);
         int number = input.nextInt();
         int count = 0 ;
         int n = 2 ;
        while (count < number ){
            int dem = 0;
            for ( int i = 1 ; i<= n ;i++ ){
                if ( n % i == 0){
                    dem++;
                }
            }if (dem == 2){
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}
