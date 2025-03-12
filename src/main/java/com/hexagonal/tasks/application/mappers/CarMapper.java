package com.hexagonal.tasks.application.mappers;

import com.hexagonal.tasks.domain.model.Car;
import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.persistence.entities.CarEntity;
import com.hexagonal.tasks.infrastructure.persistence.entities.PersonEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car toCar(CarEntity carEntity);

    CarEntity toCarEntity(Car car);

    List<Car> toCarList(List<CarEntity> carEntities);

    List<CarEntity> toCarEntityList(List<Car> cars);
}
