package session_05_ke_thua.bai_tap.Cylinder;

import session_05_ke_thua.thuc_hanh.Circle;

public class Cylinder extends Circle {
    private double height = 3.0;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCapacity(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " \n height = " + height +
                " \n Capacity " +
                getCapacity() +
                '}';
    }
}
