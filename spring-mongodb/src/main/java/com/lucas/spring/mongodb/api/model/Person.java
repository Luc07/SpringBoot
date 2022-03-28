package com.lucas.spring.mongodb.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Person")
@Data
public class Person {
	@Id
	private int id;
	private int age;
	private String name;
}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties