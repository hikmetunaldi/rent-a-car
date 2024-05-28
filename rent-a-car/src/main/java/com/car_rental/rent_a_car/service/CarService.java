package com.car_rental.rent_a_car.service;

import com.car_rental.rent_a_car.model.Car;
import com.car_rental.rent_a_car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public List<Car> saveAll(List<Car> cars){
        return repository.saveAll(cars);
    }

    public Car save(Car car){
        return repository.save(car);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Car> getAllByCity(String city){
        return repository.getAllByCity(city);
    }

    public List<Car> getAllByCarTypeAndCity(String carType, String city){
        return repository.getAllByCarTypeAndCity(carType, city);
    }
    public List<Car> getAllByGearBoxAndCity(String gearBox, String city){
        return repository.getAllByGearBoxAndCity(gearBox, city);
    }

    public Car getById(Long id){
        return repository.findById(id).orElse(null);
    }
}
