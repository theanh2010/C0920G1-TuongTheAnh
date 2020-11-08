package session_10_tree_map.bai_tap.quan_li_san_pham;

import java.util.Comparator;
import java.util.List;

public class SortProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            return 1;
        }else if (product1.getPrice() < product2.getPrice()) {
            return -1;
        }else
        return 0;
    }
}