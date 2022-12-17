package com.example.Cars.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int carId;

    String plateNumber;
    String carBrnd;
    int carYear;
    String carColor;

    LocalDate carAddingDate;



    public Car() {

    }

    public Car(int carId, String plateNumber, String carBrnd, int carYear, String carColor, LocalDate carAddingDate) {
        this.carId = carId;
        this.plateNumber = plateNumber;
        this.carBrnd = carBrnd;
        this.carYear = carYear;
        this.carColor = carColor;
        this.carAddingDate = carAddingDate;
    }
}











