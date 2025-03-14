package com.hexagonal.tasks.infrastructure.ports.out;

import com.hexagonal.tasks.domain.model.Person;

import java.util.List;
import java.util.Optional;

public interface IPersonPortOut {
    Optional<Person> findPersonById(Long id);
    Person save(Person person);
    void deleteById(Long id);
    List<Person> findAll();
    Optional<Person> findPersonBycars(String plate);
}
