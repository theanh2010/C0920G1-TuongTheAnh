package session_06_abstractClass_interface.bai_tap.interface_resize_for_shape;

import session_05_ke_thua.thuc_hanh.Shape;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius =radius;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                '}';
    }

    @Override
    public void resize(double percent) {

        setRadius(getRadius()*percent);
    }
}
