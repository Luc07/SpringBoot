package com.lucas.spring.h2.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="locacao")
@Data	
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLocacao;
	
	@ManyToMany
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	private List<Book> locacaoLivros;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id", referencedColumnName = "id")
	private Person person;
	
	public void assignPerson(Person p) {
		this.person = p;
	}
	
	public void addBookLocacao(Book b) {
		this.locacaoLivros.add(b);
	}
}
