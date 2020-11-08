package session_09_stack_queue.bai_tap.thap_phan_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    //    chuyển đổi hệ thập phân qua nhị phân
    public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.println("Nhập số cần chuyển đổi");
//    int number = input.nextInt();
//    Stack<Integer> stack = new Stack<>();
//   while ((number) > 0){
//       stack.push(number%2);
//       number = number/2;
//   }
//   while (!stack.empty()){
//       System.out.print(stack.pop() + " ");
//   }
        System.out.println(Integer.toBinaryString(15));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nhị phân cần chuyển : ");
        String binaryString = scanner.nextLine();
        System.out.println(Integer.parseInt(binaryString,2));
    }
}