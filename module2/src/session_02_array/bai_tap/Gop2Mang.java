package session_02_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;


public class Gop2Mang {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        int[] b = {6,7,9};
//        int[] c =new int[a.length + b.length];
//        for ( int i = 0 ; i < a.length ;i++ ){
//            c[i]=a[i];
//        }
//        for (int j = 0 ; j<b.length ; j++ ){
//            c[a.length+ j] = b[j];
//        }
//        System.out.println(Arrays.toString(c));
    Scanner input = new Scanner(System.in);
    int n;
    int m;

    do {
        System.out.println("nhập số lượng phần tử vào mảng a");
        n  = input.nextInt();
    }while (n <=0);
    do {
        System.out.println("nhập số lượng phần tử vào mảng b");
        m = input.nextInt();
    }while (m <=0);
        int[] a = new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.print("nhập phần tử thứ " + (i+1) + " của mảng a :");
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int[] b = new int[m];
        for ( int j = 0 ; j < m ; j++){
            System.out.print("nhập phần tử thứ " + (j+1) + " của mảng b :");
            b[j] = input.nextInt();
        }
        System.out.println(Arrays.toString(b));
        int[] c =new int[n+m];
        for (int z = 0 ; z < n ; z++){
            c[z]=a[z];
        }
        for (int k = 0 ; k < m ; k++){
            c[n + k] = b[k];
        }
        System.out.println(Arrays.toString(c));
    }
}
