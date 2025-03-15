package com.hexagonal.tasks.infrastructure.persistence.repositories;

import com.hexagonal.tasks.infrastructure.persistence.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
