package com.codegym.entity.product;

import com.codegym.entity.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product" )
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "preson_number", nullable = false)
    private String personNumber;

    @Column(name = "status_product", nullable = false)
    private String statusProduct;

    @ManyToOne
    @JoinColumn(name = "id_product_for_car_type", referencedColumnName = "id")
    private CarType carType;

    @ManyToOne
    @JoinColumn(name = "id_product_type", referencedColumnName = "id")
    private ProductType productType;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Contract> contractSet;


    public Product() {
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPresonNumber(String presonNumber) {
        this.personNumber = personNumber;
    }

    public String getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct = statusProduct;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
