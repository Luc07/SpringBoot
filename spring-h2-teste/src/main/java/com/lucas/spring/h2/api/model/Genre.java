package com.lucas.spring.h2.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "genre")
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_genre")
	private Long id;
	private String type;
	
	
}
