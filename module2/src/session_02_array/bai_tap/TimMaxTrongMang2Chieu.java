package session_02_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int i;
        int j;
        int[][] array = new int[n][m];
        for ( i = 0 ; i < n ; i++){
            for ( j = 0 ; j < m ;j++){
                array[i][j]=input.nextInt();
            }
        }
        int max= array[0][0];
        for ( i = 0 ; i < n ; i++){
            for (j = 0; j < m ; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
