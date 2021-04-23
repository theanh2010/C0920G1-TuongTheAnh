package com.codegym.service.car;

import com.codegym.entity.customer.Car;
import com.codegym.repository.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Thế anh
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public Car findById(long id) {
        return carRepository.findById(id);
    }
}
