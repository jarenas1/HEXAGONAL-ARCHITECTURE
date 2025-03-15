package com.hexagonal.tasks.domain.dto.request;

import com.hexagonal.tasks.domain.model.Car;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateUserWOId {

    private String name;

    private List<Car> cars = new ArrayList<>();
}
