package session_04_access_modifier_static.bai_tap;

public class TestCirle  extends Cirle{
    public static void main(String[] args) {
        Cirle cirle = new Cirle(1.0,"red");
        cirle.getArea();
        cirle.getRadius();
        System.out.println(cirle.getArea());
        System.out.println(cirle.getRadius());
        TestCirle testCirle=new TestCirle();
        testCirle.getRadius();
    }
}
