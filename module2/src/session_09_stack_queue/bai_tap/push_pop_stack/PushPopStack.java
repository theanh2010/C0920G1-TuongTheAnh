package session_09_stack_queue.bai_tap.push_pop_stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PushPopStack {
    public static void main(String[] args) {
        Stack<Integer> stackList = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
           stackList.push((Integer) iterator.next());
        }
        System.out.println(arrayList.toString());
//        for (int i = 0 ; i < arrayList.size(); i++) {
//            stackList.push(arrayList.get(i));
//        }
        System.out.println(stackList);

        for (int i = 0 ; i < arrayList.size(); i++){
            arrayList.set(i,stackList.pop());
        }
        System.out.println(arrayList.toString());
        System.out.println("-----------------------------------");
            Scanner input = new Scanner(System.in);
            java.util.Stack<String> stack = new Stack<>();
            String string = input.nextLine();
//            tạo mảng mword
            String[] mWord = string.split(" ",string.length());
            String str = "";
            for (String array: mWord){
                stack.push(array);
            }
//        System.out.println(stack);
            for (int i=0; i<mWord.length; i++){
                mWord[i] = stack.pop();
                str += mWord[i] + " ";
            }
//        System.out.println(Arrays.toString(mWord));
            System.out.println(str);
        }

    }

