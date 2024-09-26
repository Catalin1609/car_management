package com.example.demo.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String brand;

    @NonNull
    private String model;

    @NonNull
    private String color;

    @NonNull
    private String gearBox;

    @NonNull
    private String fuel;

    @NonNull
    private int power;

    private String registrationNumber;
    private double pricePerDay;

    public Car() {

    }
}
