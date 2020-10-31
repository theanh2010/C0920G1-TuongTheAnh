package session_06_abstractClass_interface.thuc_hanh.interface_comparable_for_class_shape;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red",false,3.5);
        System.out.println("Sắp xếp");
//        for (ComparableCircle circle : circles){
//            System.out.println(circle);
//        }
        for (int i = 0 ; i < circles.length ; i++){
            System.out.println(circles[i]);
        }
        Arrays.sort(circles);
        System.out.println("Sắp xếp lại");
//        for (ComparableCircle circle : circles){
//            System.out.println(circle);
//        }
        for (int i = 0 ; i < circles.length ; i++ ){
            System.out.println(circles[i]);
        }
    }
}
