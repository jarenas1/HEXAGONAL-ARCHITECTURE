package com.hexagonal.tasks.infrastructure.ports.out;

import com.hexagonal.tasks.domain.dto.request.CreateCarWOid;
import com.hexagonal.tasks.domain.model.Car;

import java.util.List;
import java.util.Optional;

public interface ICarPortOut {
    Optional<Car> findCarById(Long id);
    Car save(Car car);
    void deleteById(Long id);
    List<Car> findAll();
}
