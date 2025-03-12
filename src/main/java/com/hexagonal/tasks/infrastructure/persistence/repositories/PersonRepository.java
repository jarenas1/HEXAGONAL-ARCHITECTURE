package com.hexagonal.tasks.infrastructure.persistence.repositories;

import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.persistence.entities.CarEntity;
import com.hexagonal.tasks.infrastructure.persistence.entities.PersonEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    Optional<PersonEntity> findByCarsPlate(@NotNull String cars_plate);
}
