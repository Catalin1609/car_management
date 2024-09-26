package com.example.demo.controllers;

import com.example.demo.DTO.RentalRequest;
import com.example.demo.persistance.services.RentalService;
import com.example.demo.persistance.entity.Rental;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/api/rentals")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    // Rute unice pentru metodele POST
    @PostMapping("/rent")
    public Rental rentCar(@RequestBody RentalRequest rentalRequest) {
        return rentalService.rentCar(
                rentalRequest.getCustomer(),
                rentalRequest.getCar(),
                rentalRequest.getStartDate(),
                rentalRequest.getEndDate()
        );
    }

    /*@GetMapping
    public List<Rental> getAllRentals() {  // Corectat la plural
        return rentalService.getAllRentals();
    }

    @GetMapping("/{id}")
    public Rental getRentalById(@PathVariable Long id) {
        return rentalService.getRentalById(id);
    }

    // Metodă pentru crearea unui nou rental - alternativă
    @PostMapping("/create")
    public Rental createRental(@RequestBody Rental rental) {
        return rentalService.saveRental(rental);
    }

    @PutMapping("/{id}")
    public Rental updateRental(@PathVariable Long id, @RequestBody Rental rental) {
        return rentalService.updateRental(id, rental);
    }

    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
    }*/
}
