package com.hexagonal.tasks.domain.exceptions;

public class UserDoesntHaveCarsExceptions extends RuntimeException {

    public UserDoesntHaveCarsExceptions(String message) {
        super(message);
    }
}
