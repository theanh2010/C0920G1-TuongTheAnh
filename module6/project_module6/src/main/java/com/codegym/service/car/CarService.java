package com.codegym.service.car;

import com.codegym.entity.customer.Car;
import java.util.List;

public interface CarService {

    List<Car> getCars();

    void save(Car car);

    Car findById(long id);

    List<Car> getAllCar();
}
