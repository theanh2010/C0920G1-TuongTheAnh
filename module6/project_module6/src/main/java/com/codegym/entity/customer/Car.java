package com.codegym.entity.customer;

import com.codegym.entity.contract.Contract;
import com.codegym.entity.customer.Customer;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number_plate", nullable = false)
    private String numberPlate;

    @Column(name = "car_id_number", nullable = false)
    private String carIdNumber;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Column(name = "year_manufacturing", nullable = false)
    private String yearManufacturing;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Contract> contractSet;


    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCarIdNumber() {
        return carIdNumber;
    }

    public void setCarIdNumber(String carIdNumber) {
        this.carIdNumber = carIdNumber;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearManufacturing() {
        return yearManufacturing;
    }

    public void setYearManufacturing(String yearManufacturing) {
        this.yearManufacturing = yearManufacturing;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
