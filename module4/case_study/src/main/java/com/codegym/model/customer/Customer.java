package com.codegym.model.customer;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Customer{
    private int customer_id;
    @ManyToOne
    @JoinColumn(name = "customer_type_id")
}
