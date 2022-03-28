package com.lucas.spring.h2.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "Book")
public class Book {
	@Id
	private Long id;
	private String bookName;
	@OneToOne
	@JoinColumn(name="id_person", referencedColumnName = "id")
	private Person idPerson;
}

//Abrir o H2 em localhost:port/h2