package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    // 브랜드로 자동차를 검색
    List<Car> findByBrand(String brand);

    // 색상으로 자동차를 검색
    List<Car> findByColor(String model);

    // 연도로 자동차를 검색
    List<Car> findByYear(int year);
}
