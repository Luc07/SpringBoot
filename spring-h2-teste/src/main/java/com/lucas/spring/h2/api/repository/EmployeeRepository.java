package com.lucas.spring.h2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.spring.h2.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
