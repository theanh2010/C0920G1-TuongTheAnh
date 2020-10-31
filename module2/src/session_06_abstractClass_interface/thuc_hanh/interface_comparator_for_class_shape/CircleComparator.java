package session_06_abstractClass_interface.thuc_hanh.interface_comparator_for_class_shape;

import session_05_ke_thua.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius())
            return 1;
        else if (o1.getRadius() < o2.getRadius())
            return -1;
        else
            return 0;
    }
}
