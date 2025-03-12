package com.hexagonal.tasks.infrastructure.persistence.entities;

import com.hexagonal.tasks.domain.model.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ISBN;

@Data
@Builder
@Entity
@Table(name = "cars")
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String model;

    @NotNull
    private String plate;
    @ManyToOne

    @JoinColumn(name = "owner_id")
    @NotNull
    private PersonEntity owner;
}
