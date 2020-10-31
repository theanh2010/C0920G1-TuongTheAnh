package session_06_abstractClass_interface.bai_tap.interface_resize_for_shape;

import session_05_ke_thua.thuc_hanh.Rectangle;

public class Square extends Shape implements Resizeable {
    double side ;
    public Square(){
    }
    public Square ( double side){
        this.side = side;
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*percent);
    }
}
