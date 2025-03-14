package com.hexagonal.tasks.infrastructure.persistence.repositories;

import com.hexagonal.tasks.infrastructure.persistence.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
