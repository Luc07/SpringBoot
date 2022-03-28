package com.lucas.spring.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucas.spring.mongodb.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
	Book findByBookId(int id);
}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties