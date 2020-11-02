package session_06_abstractClass_interface.bai_tap.interface_resize_for_shape;

import session_05_ke_thua.thuc_hanh.Rectangle;

public class Square extends Shape implements Resizeable,Colorable {
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
    public double getArea(){
        return  this.side * this.side;
    }

@Override
    public void abc(){
    System.out.println("con");
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area = "+ getArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*percent);
    }

    @Override
    public void howtocolor() {
        System.out.println("Color All For");
    }
}
