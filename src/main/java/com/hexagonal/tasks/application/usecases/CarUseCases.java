package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.dto.request.CreateCarWOid;
import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.infrastructure.ports.in.ICarPortIn;

import java.util.List;

public class CarUseCases implements ICarPortIn {
    @Override
    public Car findCarById(Long id) {
        return null;
    }

    @Override
    public Car save(CreateCarWOid car) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Car> findAll() {
        return List.of();
    }
}
