package com.example.demo.DTO;

import com.example.demo.persistance.entity.Car;
import com.example.demo.persistance.entity.Customer;

import java.time.LocalDate;

public class RentalRequest {
    private Customer customer;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
