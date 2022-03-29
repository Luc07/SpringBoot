package com.lucas.spring.h2.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name= "employees")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Long empId;
	private String empName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_emp_id", referencedColumnName = "emp_id")
	private List<Address> address;
}
