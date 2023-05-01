package com.example.cars.service;

import com.example.cars.entity.Car;
import com.example.cars.repository.Repo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CarServiceTest {

    private CarService carServiceUnderTest;

    @BeforeEach
    void setUp() {
        carServiceUnderTest = new CarService();
        carServiceUnderTest.repo = mock(Repo.class);
    }

    @Test
    void testAddCar() {
        // Setup
        final Car cars = new Car(0, "name", 0, "brand", "colour", 0, "datee", "status");
        final Car expectedResult = new Car(0, "name", 0, "brand", "colour", 0, "datee", "status");

        // Configure Repo.save(...).
        final Car car = new Car(0, "name", 0, "brand", "colour", 0, "datee", "status");
        when(carServiceUnderTest.repo.save(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status")))
                .thenReturn(car);

        // Run the test
        final Car result = carServiceUnderTest.addCar(cars);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAll() {
        // Setup
        final List<Car> expectedResult = List.of(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status"));

        // Configure Repo.findAll(...).
        final List<Car> cars = List.of(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status"));
        when(carServiceUnderTest.repo.findAll()).thenReturn(cars);

        // Run the test
        final List<Car> result = carServiceUnderTest.getAll();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAll_RepoReturnsNoItems() {
        // Setup
        when(carServiceUnderTest.repo.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<Car> result = carServiceUnderTest.getAll();

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetCarByDate() {
        // Setup
        final List<Car> expectedResult = List.of(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status"));

        // Configure Repo.findByDatee(...).
        final List<Car> cars = List.of(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status"));
        when(carServiceUnderTest.repo.findByDatee("datee")).thenReturn(cars);

        // Run the test
        final List<Car> result = carServiceUnderTest.getCarByDate("datee");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetCarByDate_RepoReturnsNoItems() {
        // Setup
        when(carServiceUnderTest.repo.findByDatee("datee")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Car> result = carServiceUnderTest.getCarByDate("datee");

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }
}
