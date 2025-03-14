package com.hexagonal.tasks.infrastructure.adapters.in.controllers;

import com.hexagonal.tasks.domain.dto.request.CreateCarWOid;
import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.infrastructure.ports.in.ICarPortIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CarControllerAdapterIN {

    private final ICarPortIn carPort;

    public CarControllerAdapterIN(ICarPortIn carPort) {
        this.carPort = carPort;
    }

    @GetMapping("/{id}")
    private ResponseEntity<Car> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.carPort.findCarById(id));
    }

    @PostMapping
    private ResponseEntity<Car> insert(@RequestBody CreateCarWOid car){
        return ResponseEntity.ok(this.carPort.save(car));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok("Car Deleted");
    }

    @GetMapping
    private ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(this.carPort.findAll());
    }
}
