package com.lucas.spring.h2.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int age;
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "person")
	private List<Locacao> locacoes;
}


//Abrir o H2 em localhost:port/h2