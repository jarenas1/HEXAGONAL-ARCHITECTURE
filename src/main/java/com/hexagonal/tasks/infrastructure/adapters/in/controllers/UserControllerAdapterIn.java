package com.hexagonal.tasks.infrastructure.adapters.in.controllers;

import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.ports.in.IPersonPortIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllerAdapterIn {

    private final IPersonPortIn personPort;

    public UserControllerAdapterIn(IPersonPortIn personPort) {
        this.personPort = personPort;
    }

    private ResponseEntity<Person> findById(Long id) {
        return ResponseEntity.ok().body(this.personPort.findPersonById(id));
    }
}
