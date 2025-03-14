package com.hexagonal.tasks.infrastructure.adapters.out.persistence;

import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.infrastructure.ports.out.ICarPortOut;

import java.util.List;

public class CarAdapterOut implements ICarPortOut {

    private final Car car;

    public CarAdapterOut(Car car) {
        this.car = car;
    }

    @Override
    public Car findCarById(Long id) {
        return null;
    }

    @Override
    public Car save(Car car) {
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
