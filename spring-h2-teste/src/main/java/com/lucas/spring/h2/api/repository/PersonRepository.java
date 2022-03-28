package com.lucas.spring.h2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.spring.h2.api.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}


//Abrir o H2 em localhost:port/h2