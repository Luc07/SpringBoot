package com.lucas.spring.mongodb.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

@Document(collection = "Book")
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private Person idPerson;
}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties
