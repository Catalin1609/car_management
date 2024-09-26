package com.example.demo.persistance.location;

import com.example.demo.persistance.entity.Car;
import jakarta.persistence.*;
import java.util.List;

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String city;

    @OneToMany(mappedBy = "location")
    private List<Employee> employees;

    @OneToMany(mappedBy = "location")
    private List<Car> cars;
}
