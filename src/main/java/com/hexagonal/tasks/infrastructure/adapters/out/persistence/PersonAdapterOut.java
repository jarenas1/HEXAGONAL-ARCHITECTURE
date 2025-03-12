package com.hexagonal.tasks.infrastructure.adapters.out.persistence;

import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.persistence.repositories.PersonRepository;
import com.hexagonal.tasks.infrastructure.ports.out.IPersonPortOut;

import java.util.List;
import java.util.Optional;

public class PersonAdapterOut implements IPersonPortOut {

    private final PersonRepository personRepository;

    public PersonAdapterOut(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> findPersonById(Long id) {
        return this.personRepository.findById(id);
    }

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Person> findAll() {
        return List.of();
    }

    @Override
    public Optional<Person> findPersonBycars(String plate) {
        return Optional.empty();
    }
}
