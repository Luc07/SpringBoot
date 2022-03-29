package com.lucas.spring.h2.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.spring.h2.api.model.Book;
import com.lucas.spring.h2.api.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;

	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> listAllBooks() {
		return bookRepository.findAll();
	}

	public Optional<Book> getBookById(Long id) {
		return bookRepository.findById(id);
	}

	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

	public Book updateBook(Long id, Book book) {
		Book b = bookRepository.getById(id);
		b.setBookName(book.getBookName());
		return bookRepository.save(b);
	}
}


//Abrir o H2 em localhost:port/h2