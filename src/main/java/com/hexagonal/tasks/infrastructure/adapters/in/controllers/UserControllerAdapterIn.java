package com.hexagonal.tasks.infrastructure.adapters.in.controllers;

import com.hexagonal.tasks.domain.dto.request.CreateUserWOId;
import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.ports.in.IPersonPortIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllerAdapterIn {

    private final IPersonPortIn personPort;

    public UserControllerAdapterIn(IPersonPortIn personPort) {
        this.personPort = personPort;
    }

    @GetMapping("/{id}")
    private ResponseEntity<Person> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.personPort.findPersonById(id));
    }

    @PostMapping
    private ResponseEntity<Person> create (@RequestBody CreateUserWOId createUserWOId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.personPort.save(createUserWOId));
    }

    @PutMapping
    private ResponseEntity<Person> update (@RequestBody Person person) {
        return ResponseEntity.ok().body(this.personPort.update(person));
    }

    @GetMapping
    private ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok().body(this.personPort.findAll());
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete (@PathVariable Long id) {
        this.personPort.deleteById(id);
        return ResponseEntity.ok("User with id" + id + " deleted.");
    }
}
