package com.lucas.spring.h2.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "book")
public class Book {
	@Id
	private Long id;
	private String bookName;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_id_person")
//	private Person idPerson;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_id_genre")
//	private Genre genre;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "locacaoLivros")
	private List<Locacao> locacoes;
	
}

//Abrir o H2 em localhost:port/h2