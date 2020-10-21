package session_02_array.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"A","B","C","C","D","F","E"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        String name = input.nextLine();
        Boolean  check = false;
        for ( int i =0 ; i < students.length ; i++ ){
            if(students[i].equals(name)){
                System.out.println( (i + 1) + " tên học sinh" + name);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("không tìm thấy tên học sinh "+ name + " trong danh sách");
        }
    }

}
