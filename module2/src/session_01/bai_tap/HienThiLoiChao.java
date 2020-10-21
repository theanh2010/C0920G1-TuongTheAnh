package session_01.bai_tap;


import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Enter your name" );
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
