package com.example.demo.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "customer")
    private Address address;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
