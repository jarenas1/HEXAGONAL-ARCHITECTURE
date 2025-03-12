package com.hexagonal.tasks.infrastructure.adapters.out.persistence;

import com.hexagonal.tasks.application.mappers.CarMapper;
import com.hexagonal.tasks.application.mappers.PersonMapper;
import com.hexagonal.tasks.domain.exceptions.CarDoesntHaveOwnerException;
import com.hexagonal.tasks.domain.exceptions.UserNotFoundException;
import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.persistence.repositories.PersonRepository;
import com.hexagonal.tasks.infrastructure.ports.out.IPersonPortOut;

import java.util.List;
import java.util.Optional;

public class PersonAdapterOut implements IPersonPortOut {

    private final PersonRepository personRepository;
    public final PersonMapper personMapper;
    public final CarMapper carMapper;

    public PersonAdapterOut(PersonRepository personRepository, PersonMapper personMapper, CarMapper carMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
        this.carMapper = carMapper;
    }

    @Override
    public Optional<Person> findPersonById(Long id) {
        return Optional.of(personMapper.toPerson(this.personRepository.findById(id).orElseThrow( () -> new UserNotFoundException())));
    }

    @Override
    public Person save(Person person) {
        return personMapper.toPerson(this.personRepository.save(personMapper.toPersonEntity(person)));
    }

    @Override
    public void deleteById(Long id) {
        this.personRepository.deleteById(id);
    }

    @Override
    public List<Person> findAll() {
        return personMapper.toPersonList(this.personRepository.findAll());
    }

    @Override
    public Optional<Person> findPersonBycars(String plate) {
        return Optional.of(personMapper.toPerson(this.personRepository.findByCarsPlate(plate).orElseThrow( () -> new CarDoesntHaveOwnerException())));
    }
}
