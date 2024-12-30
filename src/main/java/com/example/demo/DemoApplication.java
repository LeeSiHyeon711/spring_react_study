package com.example.demo;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private static final Logger logger =
			LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));

		// 모든 자동차를 가져와 콘솔에 로깅
		for (Car car : carRepository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}
	}
}
