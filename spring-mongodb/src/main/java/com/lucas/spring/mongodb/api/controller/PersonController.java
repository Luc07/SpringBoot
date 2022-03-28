package com.lucas.spring.mongodb.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.spring.mongodb.api.model.Person;
import com.lucas.spring.mongodb.api.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	@PostMapping("/person")
	public ResponseEntity<Person> addPerson(@RequestBody Person person){
		return ResponseEntity.status(HttpStatus.CREATED).body(personService.addPerson(person));
	}
}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties