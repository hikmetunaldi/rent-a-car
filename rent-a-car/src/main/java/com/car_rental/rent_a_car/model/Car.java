package com.car_rental.rent_a_car.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageLink;
    private String fuelType;
    private String gearBox;
    private String carType;
    private String deposit;
    private String km;
    private String minAge;
    private String dailyPrice;
    private String city;
    private String link;
}
