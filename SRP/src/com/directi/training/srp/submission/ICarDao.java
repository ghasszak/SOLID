package com.directi.training.srp.submission;

import com.directi.training.srp.submission.entities.Car;

public interface ICarDao {
    Car findCarById(String carId);
}
