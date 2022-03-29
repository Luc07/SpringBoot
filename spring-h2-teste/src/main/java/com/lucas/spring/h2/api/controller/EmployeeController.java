package com.lucas.spring.h2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.spring.h2.api.model.Employee;
import com.lucas.spring.h2.api.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Data added";
	}
}
