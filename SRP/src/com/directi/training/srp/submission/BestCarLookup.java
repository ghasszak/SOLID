package com.directi.training.srp.submission;

import java.util.List;

import com.directi.training.srp.submission.entities.Car;

public class BestCarLookup implements IBestCarLookup {
    private final List<Car> _cars;

    public BestCarLookup(List<Car> cars){
        this._cars = cars;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
