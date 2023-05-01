package com.example.cars.controller;

import com.example.cars.entity.Car;
import com.example.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharathcars")
public class CarController {

    @Autowired
    public CarService service;

    @PostMapping("/add")
    public Car addCars(@RequestBody Car cars){
        return service.addCar(cars);
    }

    @GetMapping("/cars")
    public List<Car> getAllCar(){
        return service.getAll();
    }

    @GetMapping("/{datee}")
    public List<Car> getCarsByDate(@PathVariable String datee){
        return service.getCarByDate(datee);
    }

}
