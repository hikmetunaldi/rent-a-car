package com.car_rental.rent_a_car.controller;

import com.car_rental.rent_a_car.model.Car;
import com.car_rental.rent_a_car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CarsController {

    @Autowired
    private CarService carService;

    @PostMapping("save")
    public Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @PostMapping("save-all")
    public List<Car> saveAll(@RequestBody List<Car> cars){
        return carService.saveAll(cars);
    }

    @DeleteMapping("delete")
    public void delete(@RequestParam Long id){
        carService.delete(id);
    }

    @GetMapping("get-by-city")
    public List<Car> getCarsByCity(@RequestParam String city){
        return carService.getAllByCity(city);
    }

    @GetMapping("get-by-car-type-and-city")
    public List<Car> getAllByCarTypeAndCity(@RequestParam String carType, @RequestParam String city){
        return carService.getAllByCarTypeAndCity(carType, city);
    }

    @GetMapping("get-by-gear-box-and-city")
    public List<Car> getAllByGearBoxAndCity(@RequestParam String gearBox, @RequestParam String city){
        return carService.getAllByGearBoxAndCity(gearBox, city);
    }

    @GetMapping("get-by-id")
    public Car getById(@RequestParam Long id){
        return carService.getById(id);
    }
}
