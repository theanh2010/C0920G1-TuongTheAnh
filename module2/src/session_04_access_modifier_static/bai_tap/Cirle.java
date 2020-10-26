package session_04_access_modifier_static.bai_tap;

import javax.print.attribute.standard.PresentationDirection;

public class Cirle {
    private double radius = 1.0 ;
    private String color = "red" ;
    Cirle(){
    }
    Cirle(double radius){
    }
    public Cirle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected double getArea(){
        return Math.PI * this.radius *this.radius;
    }
}
