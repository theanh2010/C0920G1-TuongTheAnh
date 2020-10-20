package session_01.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số cân nặng ");
        double weight = input.nextDouble();
        System.out.println("nhập số chiều cao");
        double height = input.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("UnderWeight");
        }else if (bmi >= 18.5 && bmi <25.0) {
            System.out.println("Normal");
        }else if (bmi >= 25.0 && bmi <30.0){
            System.out.println("Overweight");
        }else if (bmi >= 30.0){
            System.out.println("Obese");
        }

    }
}
