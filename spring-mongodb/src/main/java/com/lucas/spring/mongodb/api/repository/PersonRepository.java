package com.lucas.spring.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucas.spring.mongodb.api.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Integer>{

}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties
