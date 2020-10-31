package session_06_abstractClass_interface.bai_tap.interface_resize_for_shape;


public class TestResizeale {
    public static void main(String[] args) {
        double percent = Math.random()*100;
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(4);
        resizeables[1] = new Rectangle(2,3);
        resizeables[2] = new Square(6);

        System.out.println("Pre-sorted:");
        for (Resizeable circle : resizeables) {
            System.out.println(circle);
        }


        System.out.println("Pre-sorted:");
        for (Resizeable circle : resizeables) {
            circle.resize(percent);
            System.out.println(circle);
        }
    }
}
