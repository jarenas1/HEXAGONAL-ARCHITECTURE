package com.hexagonal.tasks.domain.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {
    @NotNull
    private Long id;

    @NotNull
    private String model;
//    @ManyToOne
//    @JoinColumn(name = "owner_id")
    @NotNull
    private Person owner;
}
