package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        // 자동차를 검색하고 반환
        return carRepository.findAll();
    }
}
