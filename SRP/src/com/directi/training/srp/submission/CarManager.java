package com.directi.training.srp.submission;

import java.util.List;

import com.directi.training.srp.submission.entities.Car;

public class CarManager {
    private final ICarSerializer _carSerializer;
    private final IBestCarLookup _bestCarLookup;
    private final ICarDao _carDao;

    public CarManager(ICarSerializer carSerializer, IBestCarLookup bestCarLookup, ICarDao carDao){
        this._carSerializer = carSerializer;
        this._bestCarLookup = bestCarLookup;
        this._carDao = carDao;
    }

    public Car findCarById(final String carId){
        return this._carDao.findCarById(carId);
    }

    public Car getBestCar(){
        return this._bestCarLookup.getBestCar();
    }

    public String getCarsNames(List<Car> cars){
        return this._carSerializer.getCarsNames(cars);
    }

    public String getCarName(Car car){
        return this._carSerializer.getCarName(car);
    }
}
