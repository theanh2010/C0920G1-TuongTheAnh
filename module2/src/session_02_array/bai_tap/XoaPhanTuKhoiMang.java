package session_02_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int n;
        int c;
        int i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhập số phần tử muốn thêm vào mảng");
            n = input.nextInt();
        }while (n <= 0);
        System.out.println("Nhập các phần tử vào mảng ");
        int[] array =new int[n];
        for ( i = 0 ; i < n ; i++){
            System.out.println("nhập phần tử thứ " + (i+1));
            array[i]=input.nextInt();
        }
        System.out.println("nhập phần tử K");
        int k = input.nextInt();
        for (c = i = 0; i< n ;i++){
            if(array[i] != k){
                array[c] = array[i];
                c++;
            }
        }
        n=c;
        System.out.println("mảng còn lại sau khi xóa phần tử " +k+ " :");
        for ( i= 0 ; i< n ; i++){
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
