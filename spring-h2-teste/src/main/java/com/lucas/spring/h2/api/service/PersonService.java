package com.lucas.spring.h2.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.spring.h2.api.model.Person;
import com.lucas.spring.h2.api.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	public Person addPerson(Person person) {
		return personRepository.save(person);
	}
	
	public List<Person> getPersonList(){
		return personRepository.findAll();
	}
}

//Abrir o H2 em localhost:port/h2
