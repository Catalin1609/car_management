package com.example.demo.persistance.repository;

import com.example.demo.persistance.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT i FROM Car i WHERE i.model = ?1")
    List<Car> findByBrand(String brand);

}
