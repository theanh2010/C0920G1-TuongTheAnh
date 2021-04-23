package com.codegym.entity.product;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_for_car_type")
public class CarType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "car_seat", nullable = false)
    private String carSeat;

    @Column(name = "car_age", nullable = false)
    private String carAge;

    @OneToMany(mappedBy = "carType", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Product> productCarSet;

    public CarType() {
    }

    public String getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(String carSeat) {
        this.carSeat = carSeat;
    }

    public String getCarAge() {
        return carAge;
    }

    public void setCarAge(String carAge) {
        this.carAge = carAge;
    }

    public Set<Product> getProductCarSet() {
        return productCarSet;
    }

    public void setProductCarSet(Set<Product> productCarSet) {
        this.productCarSet = productCarSet;
    }
}
