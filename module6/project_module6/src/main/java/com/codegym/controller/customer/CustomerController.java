package com.codegym.controller.customer;

import com.codegym.entity.customer.Car;
import com.codegym.entity.customer.Customer;
import com.codegym.repository.car.CarRepository;
import com.codegym.repository.customer.CustomerRepository;
import com.codegym.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Thế anh
@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    public Page<Car> getCar(@RequestParam(defaultValue = "0") int page) {
        return this.carRepository.findAll(PageRequest.of(page,3));
    }

    //    danh sách khách hàng
    @GetMapping("/")
    public List<Customer> getCustomer(){

    }

    //    Lay doi tượng xe = id.
    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        return ResponseEntity.ok().body(customer);
    }

    //    Tạo mới customer
    @PostMapping(value = "/customer/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer goCreateUser(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
