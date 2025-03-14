package com.hexagonal.tasks.infrastructure.adapters.out.persistence;

import com.hexagonal.tasks.application.mappers.CarMapper;
import com.hexagonal.tasks.domain.exceptions.CarNotFounException;
import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.infrastructure.persistence.repositories.CarRepository;
import com.hexagonal.tasks.infrastructure.ports.out.ICarPortOut;

import java.util.List;

public class CarAdapterOut implements ICarPortOut {


    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarAdapterOut(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public Car findCarById(Long id) {
        return carMapper.toCar(carRepository.findById(id).orElseThrow(() -> new CarNotFounException("Car not found")));
    }

    @Override
    public Car save(Car car) {
        return carMapper.toCar(this.carRepository.save(carMapper.toCarEntity(car)));
    }

    @Override
    public void deleteById(Long id) {
        this.carRepository.deleteById(id);
    }

    @Override
    public List<Car> findAll() {
        return carMapper.toCarList(this.carRepository.findAll());
    }
}
