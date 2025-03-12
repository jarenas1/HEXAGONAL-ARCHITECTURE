package com.hexagonal.tasks.infrastructure.persistence.repositories;

import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.persistence.entities.CarEntity;
import com.hexagonal.tasks.infrastructure.persistence.entities.PersonEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    Optional<Person> findByCarsPlate(@NotNull String cars_plate);
}
