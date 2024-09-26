package com.example.demo.persistance.location;

import jakarta.persistence.*;


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String role;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
