package session_06_abstractClass_interface.bai_tap.interface_resize_for_shape;

public class TestColorable {
    public static void main(String[] args) {
//        tạo mảng shape chứa 3 đối tượng của các lớp con của nó

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(1);
        shapes[1] = new Circle(2);
        shapes[2] = new Rectangle(4,5);

//        ((Square) shapes[0]).howtocolor();
//
//        if (shapes[0] instanceof Square){
//            System.out.println("phải");
//        } else {
//            System.out.println("không");
//        }
        System.out.println("mảng ban đầu");
        for ( int i = 0 ; i < shapes.length ; i++){
            System.out.println(shapes[i]);
        }
        System.out.println("mảng sau khi duyệt");
//        Xét xem đối tượng nào có COlorable
        for (int i = 0 ; i < shapes.length ; i++){
            if (shapes[i] instanceof Colorable){
//                Ép kiểu sang colorable để dùng pthuc howtocolor
                ((Colorable) shapes[i]).howtocolor();
                System.out.println("hình có chứa colorable "+shapes[i]);
//                Square shape = (Square) shapes[i];
//                Colorable shape1 = shape;
//                shape1.howtocolor();
            }else {
                System.out.println("hình không có chứa colorable " +shapes[i]);
            }

        }

        }
    }
