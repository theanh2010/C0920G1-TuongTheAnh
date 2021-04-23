package com.codegym.repository.car;

import com.codegym.entity.customer.Car;
import com.codegym.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT car FROM Car car")
    List<Car> findAll();

    @Query("SELECT car from Car car where car.id = ?1")
    Car findById(long id);
}
