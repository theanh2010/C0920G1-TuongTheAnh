package session_01.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width ;
        float height ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        width = scanner.nextFloat();
        System.out.println("Enter Height");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is :" + area);
    }
}
