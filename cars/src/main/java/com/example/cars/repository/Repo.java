package com.example.cars.repository;

import com.example.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<Car,Integer> {
    List<Car> findByDatee(String datee);
}
