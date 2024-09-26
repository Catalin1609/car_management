package com.example.demo.persistance.repository;

import com.example.demo.persistance.entity.Customer;
import com.example.demo.persistance.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
    List<Rental> findByCustomer(Customer customer);
}
