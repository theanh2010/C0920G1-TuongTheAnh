package session_02_array.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size ;
        int[] array = {};
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhập số lượng phần tử muốn thêm vào mảng");
            size = input.nextInt();
            if ( size > 20){
                System.out.println("số lượng phần tử trong mảng không được quá 20");
            }

        }while (size> 20);
        array = new int[size];
        int i= 0;
        while (i < array.length){
            System.out.println("nhập số vào phần tử " + (i+1) + " :");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("danh sách phần tử đã nhập : ");
        for (int j = 0 ; j < array.length ; j++){
            System.out.println(array[j]);
        }
        int min = searchMin(array);
        System.out.println("giá trị nhỏ nhất trong mảng là "+ min);

    }
    public static int searchMin(int[] array){
        int min = array[0];
        for (int i = 0 ; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
