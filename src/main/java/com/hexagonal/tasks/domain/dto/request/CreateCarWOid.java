package com.hexagonal.tasks.domain.dto.request;

import com.hexagonal.tasks.domain.model.Person;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateCarWOid {
    private String model;

    @NotNull
    private String plate;

    @NotNull
    private Person owner;
}
