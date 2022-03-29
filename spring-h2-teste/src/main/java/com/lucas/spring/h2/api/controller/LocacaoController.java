package com.lucas.spring.h2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.spring.h2.api.model.Book;
import com.lucas.spring.h2.api.model.Locacao;
import com.lucas.spring.h2.api.model.Person;
import com.lucas.spring.h2.api.repository.BookRepository;
import com.lucas.spring.h2.api.repository.LocacaoRepository;
import com.lucas.spring.h2.api.repository.PersonRepository;

@RestController
public class LocacaoController {

	@Autowired
	LocacaoRepository locacaoRepository;
	@Autowired
	BookRepository bookRepository;
	@Autowired
	PersonRepository personRepository;
	
	@PostMapping("/locacao")
	public Locacao addLocacao(@RequestBody Locacao locacao) {
		return locacaoRepository.save(locacao);
	}
	
	@PutMapping("/locacao/{id_book}/{locacaoId}/{clientId}")
	public Locacao livroLocacaoCliente(@PathVariable Long id_book, @PathVariable Long locacaoId, @PathVariable Long clientId) {
		Book b = bookRepository.findById(id_book).get();
		Person p = personRepository.findById(clientId).get();
		Locacao l = locacaoRepository.findById(locacaoId).get();
		l.addBookLocacao(b);
		l.assignPerson(p);
		return locacaoRepository.save(l);
	}
}
