package com.hexagonal.tasks.domain.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private Long id;

    @NotNull
    private String model;

    @NotNull
     private String plate;

    @NotNull
    private Person owner;
}
