package com.cnietsche.portsAdapters.services;

import com.cnietsche.portsAdapters.dtos.CreatePersonDTO;
import com.cnietsche.portsAdapters.entities.Person;
import com.cnietsche.portsAdapters.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void createPerson(CreatePersonDTO createPerson) {
        personRepository.save(
                Person.builder()
                        .name(createPerson.name())
                        .age(createPerson.age())
                        .build()
        );
    }
}
