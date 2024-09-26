package com.example.demo.persistance.services;

import com.example.demo.persistance.entity.Car;
import com.example.demo.persistance.entity.Customer;
import com.example.demo.persistance.entity.Rental;
import com.example.demo.persistance.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;

    public Rental rentCar(Customer customer, Car car, LocalDate startDate, LocalDate endDate) {
        Rental rental = new Rental();
        rental.setCar(car);
        rental.setCustomer(customer);
        rental.setRentalDate(startDate);
        rental.setReturnDate(endDate);
        rental.setTotalPrice(calculateTotalPrice(car, startDate, endDate));
        return rentalRepository.save(rental);

    }

    private double calculateTotalPrice(Car car, LocalDate startDate, LocalDate endDate) {
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        return car.getPricePerDay() * days;
    }
}
