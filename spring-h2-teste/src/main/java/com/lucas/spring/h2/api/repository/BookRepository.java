package com.lucas.spring.h2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.spring.h2.api.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
}


//Abrir o H2 em localhost:port/h2