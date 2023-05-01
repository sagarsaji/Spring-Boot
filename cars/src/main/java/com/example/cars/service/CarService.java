package com.example.cars.service;

import com.example.cars.entity.Car;
import com.example.cars.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    public Repo repo;

    public Car addCar(Car cars) {
        return repo.save(cars);
    }

    public List<Car> getAll() {
        return repo.findAll();
    }

    public List<Car> getCarByDate(String datee) {
        return repo.findByDatee(datee);
    }
}
