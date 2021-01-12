package com.codegym.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Service
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int customer_type_id;
    private String customer_type_name;

    @OneToMany(mappedBy = customer_type)
    JoinColumn(name = "customer_type_id")

}
