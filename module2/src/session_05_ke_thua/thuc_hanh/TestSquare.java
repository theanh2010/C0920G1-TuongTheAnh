package session_05_ke_thua.thuc_hanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.0);
        System.out.println(square);
    }
}
