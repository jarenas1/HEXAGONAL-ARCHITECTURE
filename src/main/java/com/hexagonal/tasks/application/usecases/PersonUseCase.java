package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.dto.request.CreateUserWOId;
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
        return null;
    }

    @Override
    public Person save(CreateUserWOId person) {
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
    public Person findPersonBycars(String plate) {
        return null;
    }
}
