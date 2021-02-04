package com.codegym.entity;

import javax.persistence.*;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue
    private String idContract;

    private String starDate;

    private String endDate;

    @ManyToOne
    private
}
