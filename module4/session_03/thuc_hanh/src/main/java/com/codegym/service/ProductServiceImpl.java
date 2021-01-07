package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Iphone X","500$","https://cdn.cellphones.com.vn/media/catalog/product/cache/7/image/9df78eab33525d08d6e5fb8d27136e95/i/p/iphone_x_64gb_3.jpg",12));
        products.put(2,new Product(2,"Iphone 11","1000$","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9W4BH_iWaMRchVcoknu55_DyaGFXG_cn1yBGm0ht1jpKQLmEHJTSl3E5AyfhihHfeOkceWcff&usqp=CAc",8));
        products.put(3,new Product(3,"Iphone 12","1500$","https://hoanghamobile.com/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png",9));
        products.put(4,new Product(4,"Iphone 12 PRO MAX","2000$","/resources/img/iphone_x_64gb_3.jpg",3));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
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
