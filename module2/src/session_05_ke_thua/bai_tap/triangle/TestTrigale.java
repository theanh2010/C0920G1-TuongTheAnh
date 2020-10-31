package session_05_ke_thua.bai_tap.triangle;

import java.util.Scanner;

public class TestTrigale {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("nhap do dai 3 canh tam giac");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.println("nhap mau");
        String color = input.nextLine();
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(side1,side2,side3);
        System.out.println(triangle);
        triangle = new Triangle(color, true,side1,side2,side3);
        System.out.println(triangle);

    }
}
