package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
//    // 브랜드로 자동차를 검색
//    List<Car> findByBrand(String brand);

    // 색상으로 자동차를 검색
    List<Car> findByColor(String model);

    // 연도로 자동차를 검색
    List<Car> findByYear(int year);

    // 브랜드와 모델로 자동차를 검색
    List<Car> findByBrandAndModel(String brand, String model);

    // 브랜드나 색상으로 자동차를 검색
    List<Car> findByBrandOrColor(String brand, String color);

    // 브랜드로 자동차를 검색하고 연도로 정렬
    List<Car> findByBrandOrderByYearAsc(String brand);

    // SQL 문을 이용해 브랜드로 자동차를 검색
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);

    // SQL 문을 이용해 브랜드로 자동차를 검색
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(String brand);
}
