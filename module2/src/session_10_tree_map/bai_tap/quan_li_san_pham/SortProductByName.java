package session_10_tree_map.bai_tap.quan_li_san_pham;

import java.util.Comparator;

public class SortProductByName implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getName().compareTo(product2.getName());
    }
}
