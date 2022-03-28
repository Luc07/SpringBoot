package com.lucas.spring.mongodb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.spring.mongodb.api.model.Book;
import com.lucas.spring.mongodb.api.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBook(book));
	}
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> listAllBooks(){
		return ResponseEntity.status(HttpStatus.OK).body(bookService.listAllBooks());
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getBookById(id));
	}
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/book/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book){
		return ResponseEntity.status(HttpStatus.OK).body(bookService.updateBook(id, book));
	}
	
}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties