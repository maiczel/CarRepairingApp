package com.example.Cars.service;


import com.example.Cars.entity.Car;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> carsList = new ArrayList<>(Arrays.asList(
            new Car(1,"RPR96MG","Opel",2007,"Granatowy", LocalDate.of(2022,12,17)),
            new Car(2,"KRK1234","Mazda",2017,"Czerwony", LocalDate.of(2022,12,01))
    ));
}
