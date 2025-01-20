package com.cnietsche.portsAdapters.controllers;

import com.cnietsche.portsAdapters.dtos.CreatePersonDTO;
import com.cnietsche.portsAdapters.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Void> createPerson(@RequestBody CreatePersonDTO createPerson) {
        personService.createPerson(createPerson);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
