package session_05_ke_thua.thuc_hanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5.0,5.0);
        System.out.println(rectangle);
        rectangle = new Rectangle("red",true,3.0,3.0);
        System.out.println(rectangle);
    }

}
