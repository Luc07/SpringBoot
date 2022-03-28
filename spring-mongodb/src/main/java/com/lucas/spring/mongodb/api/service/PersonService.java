package com.lucas.spring.mongodb.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.spring.mongodb.api.model.Person;
import com.lucas.spring.mongodb.api.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	public Person addPerson(Person person) {
		Person p = new Person();
		p.setId(getPersonList().size() + 1);
		p.setAge(person.getAge());
		p.setName(person.getName());
		return personRepository.save(p);
	}
	
	public List<Person> getPersonList(){
		return personRepository.findAll();
	}
}


//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties