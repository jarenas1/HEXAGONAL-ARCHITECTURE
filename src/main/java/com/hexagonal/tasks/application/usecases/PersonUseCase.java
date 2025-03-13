package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.dto.request.CreateUserWOId;
import com.hexagonal.tasks.domain.exceptions.UserNotFoundException;
import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.adapters.out.persistence.PersonAdapterOut;
import com.hexagonal.tasks.infrastructure.ports.in.IPersonPortIn;
import com.hexagonal.tasks.infrastructure.ports.out.IPersonPortOut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonUseCase implements IPersonPortIn {

    private final IPersonPortOut personPort;

    public PersonUseCase(IPersonPortOut personPort) {
        this.personPort = personPort;
    }


    @Override
    public Person findPersonById(Long id) {
        return personPort.findPersonById(id).orElseThrow( () ->
                new UserNotFoundException("The user with id " + id + " does not exist.")
        );
    }

    @Override
    public Person save(CreateUserWOId person) {
        Person personModel = Person.builder()
                .name(person.getName())
                .cars(person.getCars())
                .build();
        return this.personPort.save(personModel);
    }


    @Override
    public Person update(Person person) {
        return this.personPort.save(person);
    }

    @Override
    public void deleteById(Long id) {
        this.personPort.deleteById(id);
    }

    @Override
    public List<Person> findAll() {
        return this.personPort.findAll();
    }

    @Override
    public Person findPersonBycars(String plate) {
        return null;
    }
}
