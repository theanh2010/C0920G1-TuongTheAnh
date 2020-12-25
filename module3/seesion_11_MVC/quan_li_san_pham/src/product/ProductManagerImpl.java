package product;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManagerImpl implements  ProductManager {

    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Iphone 12 ProMax","2000$","3"));
        products.put(2, new Product(2,"Iphone 12 Pro","1500$","5"));
        products.put(3, new Product(3,"Iphone 12 ","1200$","10"));
        products.put(4, new Product(4,"Iphone SE 2020","800$","20"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findByName(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
