package com.lucas.spring.mongodb.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.spring.mongodb.api.model.Book;
import com.lucas.spring.mongodb.api.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;

	public Book addBook(Book book) {
		Book b = new Book();
		b.setBookId(listAllBooks().size() + 1);
		b.setIdPerson(book.getIdPerson());
		b.setBookName(book.getBookName());
		return bookRepository.save(b);
	}

	public List<Book> listAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(int id) {
		return bookRepository.findByBookId(id);
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	public Book updateBook(int id, Book book) {
		Book b = bookRepository.findByBookId(id);
		b.setBookName(book.getBookName());
		return bookRepository.save(b);
	}
}

//Aplicativo do mongoDB compass / mongosh localhost:27017 olhar properties