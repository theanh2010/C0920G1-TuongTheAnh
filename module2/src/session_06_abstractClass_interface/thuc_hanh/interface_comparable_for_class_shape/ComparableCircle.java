package session_06_abstractClass_interface.thuc_hanh.interface_comparable_for_class_shape;

import session_05_ke_thua.thuc_hanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(){
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean isFilled, double radius) {
        super(color, isFilled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else
            return 1;
    }
}
