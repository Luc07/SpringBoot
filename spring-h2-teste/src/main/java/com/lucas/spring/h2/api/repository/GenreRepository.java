package com.lucas.spring.h2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.spring.h2.api.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
