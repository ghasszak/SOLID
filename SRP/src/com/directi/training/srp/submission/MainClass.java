package com.directi.training.srp.submission;

import java.util.Arrays;
import java.util.List;

import com.directi.training.srp.submission.entities.Car;

public class MainClass {
    public static void main(String[] args){
        List<Car> cars = Arrays.asList(new Car("1", "Golf III", "Volkswagen"),
                        new Car("2", "Multipla", "Fiat"),
                        new Car("3", "Megane", "Renault"));

        // CarManager Configuration
        CarSerializer carSerializer = new CarSerializer();
        BestCarLookup bestCarLookup = new BestCarLookup(cars);
        CarDao carDao = new CarDao(cars);
        CarManager carManager = new CarManager(carSerializer, bestCarLookup, carDao);

        // Business logic
        System.out.println("Cars names: " + carManager.getCarsNames(cars)); // display all cars
        System.out.println("Car 1 name: " + carManager.getCarName(carManager.findCarById("1"))); // display car with id 1
        System.out.println("Best car id: " + carManager.getBestCar().getId()); // display id of the best car
        System.out.println("Brand of the car with id = 1 : " + carManager.findCarById("1").getBrand()); // display brand of the car with id = 1
    }
}
