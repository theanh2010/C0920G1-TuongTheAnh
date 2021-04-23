package com.codegym.entity.customer;

import com.codegym.entity.account.Users;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private String dateOfBirth;

    @Column(name = "id_card", nullable = false, unique = true)
    private String idCard;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "img",columnDefinition = "LONGTEXT")
    private String img;

    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "user_id", referencedColumnName ="id")
    private Users users;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Car> carSet;

    public Customer(){
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
