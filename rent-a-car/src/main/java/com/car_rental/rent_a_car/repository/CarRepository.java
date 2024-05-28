package com.car_rental.rent_a_car.repository;

import com.car_rental.rent_a_car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository <Car, Long>{
    List<Car> getAllByCity(String city);
    List<Car> getAllByCarTypeAndCity(String carType, String city);
    List<Car> getAllByGearBoxAndCity(String gearBox, String city);
}
