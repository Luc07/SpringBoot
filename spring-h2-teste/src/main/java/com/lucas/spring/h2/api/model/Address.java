package com.lucas.spring.h2.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="add_id")
	private Long addressId;
	private String city;
}
