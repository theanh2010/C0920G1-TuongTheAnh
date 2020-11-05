package session_06_abstractClass_interface.thuc_hanh.interface_comparable_for_class_shape;

import java.util.Comparator;

public class CompeString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
