package com.hexagonal.tasks.application.mappers;

import com.hexagonal.tasks.domain.model.Person;
import com.hexagonal.tasks.infrastructure.persistence.entities.PersonEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CarMapper.class })
public interface PersonMapper {

    Person toPerson(PersonEntity personEntity);

    PersonEntity toPersonEntity(Person person);

    List<Person> toPersonList(List<PersonEntity> personEntities);

    List<PersonEntity> toPersonEntityList(List<Person> persons);
}
