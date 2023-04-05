package com.example.samochodyrestapi.api;

import com.example.samochodyrestapi.DAO.entity.Car;
import com.example.samochodyrestapi.manager.CarManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarApi {

    private CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/all")
    public Iterable<Car> getAll() {
        return carManager.findAll();
    }

    @GetMapping
    public Optional<Car> getById(@RequestParam long index) {
        return carManager.findAllById(index);
    }

    @PostMapping
    public Car addVideo(@RequestBody Car car) {
        return carManager.save(car);
    }

    @PutMapping
    public Car updateVideo(@RequestBody Car car) {
        return carManager.save(car);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam long index) {
        carManager.delete(index);
    }
}
