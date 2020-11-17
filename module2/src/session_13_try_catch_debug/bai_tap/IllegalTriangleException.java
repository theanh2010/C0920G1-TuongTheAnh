package session_13_try_catch_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        try {
            checkException( a,b, c);
        } catch (Exception e) {
            System.out.print("sai rùi bạn ơi");
        }

    }

    private static void checkException(int a , int b , int c) throws Exception {
        if (a + b < c) {
            throw new Exception();
        }else {
            System.out.println("tính chu vi hình tam giác");
            int result = a + b + c;
            System.out.println(result);
        }
    }
}