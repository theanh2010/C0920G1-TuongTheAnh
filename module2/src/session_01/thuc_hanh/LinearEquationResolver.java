package session_01.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Bộ giải phương trình tuyến tính");
        System.out.println("Cho một phương trình dưới dạng 'a * x + b = 0', vui lòng nhập hằng số");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a :");
        double a =scanner.nextDouble();
        System.out.println("b :");
        double b = scanner.nextDouble();
        if (a != 0){
            double ketQua = -b/a;
            System.out.println("Kết quả là :" + ketQua);
        }else {
            if ( b == 0){
                System.out.println("phương trình vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }

    }
}
