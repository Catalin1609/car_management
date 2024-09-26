package com.example.demo;

import com.example.demo.persistance.services.CarService;
import com.example.demo.persistance.entity.Car;
import com.example.demo.persistance.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {

        @InjectMocks
        private CarService carService;

        @Mock
        private CarRepository carRepository;

        @Test
        public void testGetCarById() {
            Car car = new Car();
            car.setId(1L);
            Mockito.when(carRepository.findById(1L)).thenReturn(Optional.of(car));

            Car foundCar = carService.getCarById(1L);

            assertNotNull(foundCar);
            assertEquals(1L, foundCar.getId().longValue());
        }
}
