package com.codegym.model;

@Entity
@Table

public class Product implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;
    private String img;
    private int quantiy;

    public Product(int id, String name, String price, String img, int quantiy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.quantiy = quantiy;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    @Override
    public Product clone() {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setImg(img);
        return product;
    }
}
