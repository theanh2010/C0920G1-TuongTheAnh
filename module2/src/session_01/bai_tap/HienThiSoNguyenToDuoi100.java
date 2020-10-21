package session_01.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToDuoi100 {
    public static void main(String[] args) {
        int count = 0 ;
        int n = 2 ;
        for (int j =1 ; j < 100 ; j++){
            long dem = 0;
            for ( long i = 1 ; i<= n ;i++ ){
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
