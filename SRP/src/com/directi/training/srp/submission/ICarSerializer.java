package com.directi.training.srp.submission;

import java.util.List;

import com.directi.training.srp.submission.entities.Car;

public interface ICarSerializer {
    String getCarsNames(List<Car> cars);
    String getCarName(Car car);
}
