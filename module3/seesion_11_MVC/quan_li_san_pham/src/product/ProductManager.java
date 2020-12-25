package product;

import model.Product;

import java.util.List;

public interface ProductManager {
    List<Product> findAll();

    void save(Product product);

    Product findByName(int id);

    void update (int id, Product product);

    void remove (int id);
}
