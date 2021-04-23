package com.codegym.entity.product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "product_price", nullable = false ,columnDefinition = "DOUBLE")
    private String productPrice;

    @OneToMany(mappedBy = "productType", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Product> productTypeSet;

    public ProductType() {
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Set<Product> getProductTypeSet() {
        return productTypeSet;
    }

    public void setProductTypeSet(Set<Product> productTypeSet) {
        this.productTypeSet = productTypeSet;
    }
}
