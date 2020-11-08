package session_09_stack_queue.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    //    Kiểm tra chuỗi Palindrome sử dụng Queue
    public static void main(String[] args) {
//    int count = 0;
        boolean check = true;
        System.out.println("nhập chuỗi cần tìm");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        Queue<Character> queue = new LinkedList();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
//        count++;
        }
        System.out.println(stack);
        System.out.println(queue);
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("giống nhau từng cặp thì đó là chuỗi Palindrome");
        } else {
            System.out.println("không nhau từng cặp ");
        }

//    while (!stack.isEmpty()){
////        if ( stack.pop().equals(queue.poll())){
////            check++;
////        }
////    }
////    if (check == count){
////        System.out.println("giống nhau từng cặp thì đó là chuỗi Palindrome");
////    }else {
////        System.out.println("trên không phải là chuỗi Palindrome");
////    }
    }
}