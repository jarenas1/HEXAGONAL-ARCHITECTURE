package com.hexagonal.tasks.domain.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {
    private Long id;
    private String model;
//    @ManyToOne
//    @JoinColumn(name = "owner_id")
    private Person owner;
}
