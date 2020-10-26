package session_02_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang2 {
    public static void main(String[] args) {
        int n;
        int i;
        int j;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhập số phần tử muốn thêm vào mảng");
            n = input.nextInt();
        } while (n <= 0);
        System.out.println("Nhập các phần tử vào mảng ");
        int[] array = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("nhập phần tử K");
        int k = input.nextInt();
        for (i = 0; i < array.length; i++) {
            if (array[i] == k) {
                for (j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                System.out.println("mảng đã xóa :");
                for (i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

            }
        }
    }
}