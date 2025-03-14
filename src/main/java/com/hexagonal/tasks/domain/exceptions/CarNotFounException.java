package com.hexagonal.tasks.domain.exceptions;

public class CarNotFounException extends RuntimeException {

    public CarNotFounException(String message) {
        super(message);
    }
}
