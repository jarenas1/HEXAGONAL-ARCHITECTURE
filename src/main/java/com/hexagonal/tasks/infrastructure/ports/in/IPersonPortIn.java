package com.hexagonal.tasks.infrastructure.ports.in;

import com.hexagonal.tasks.domain.dto.request.CreateUserWOId;
import com.hexagonal.tasks.domain.model.Person;

import java.util.List;
import java.util.Optional;

public interface IPersonPortIn {
    Person findPersonById(Long id);
    Person save(CreateUserWOId person);
    Person update(Person person);
    void deleteById(Long id);
    List<Person> findAll();
    Person findPersonBycars(String plate);
}
