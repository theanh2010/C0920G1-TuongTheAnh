package session_06_abstractClass_interface.bai_tap.interface_resize_for_shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double wight, double length) {
        this.width = wight;
        this.length = length;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area= " + getArea() +

                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() * percent);
        setLength(getLength() * percent);
    }

}
