package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.dto.request.CreateCarWOid;
import com.hexagonal.tasks.domain.exceptions.CarNotFounException;
import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.infrastructure.adapters.out.persistence.CarAdapterOut;
import com.hexagonal.tasks.infrastructure.ports.in.ICarPortIn;
import com.hexagonal.tasks.infrastructure.ports.out.ICarPortOut;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarUseCases implements ICarPortIn {

    private final ICarPortOut carPort;

    public CarUseCases(ICarPortOut carPort) {
        this.carPort = carPort;
    }

    @Override
    public Car findCarById(Long id) {
        return this.carPort.findCarById(id).orElseThrow(() -> new CarNotFounException("Car not found"));
    }

    @Override
    public Car save(CreateCarWOid car) {
        Car carToSave = Car.builder()
                .plate(car.getPlate())
                .model(car.getModel())
                .owner(car.getOwner())
                .build();
        return this.carPort.save(carToSave);
    }

    @Override
    public Car update(Car car) {
        Car toUpdate = this.findCarById(car.getId());
        toUpdate.setPlate(car.getPlate());
        toUpdate.setModel(car.getModel());
        toUpdate.setOwner(car.getOwner());
        return this.carPort.save(toUpdate);
    }

    @Override
    public void deleteById(Long id) {
        this.carPort.deleteById(id);
    }

    @Override
    public List<Car> findAll() {
        return this.carPort.findAll();
    }
}
