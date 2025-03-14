package com.hexagonal.tasks.infrastructure.ports.in;

import com.hexagonal.tasks.domain.dto.request.CreateCarWOid;
import com.hexagonal.tasks.domain.dto.request.CreateUserWOId;
import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.domain.model.Person;

import java.util.List;

public interface ICarPortIn {
    Car findCarById(Long id);
    Car save(CreateCarWOid car);
    Car update(Car car);
    void deleteById(Long id);
    List <Car> findAll();
}
