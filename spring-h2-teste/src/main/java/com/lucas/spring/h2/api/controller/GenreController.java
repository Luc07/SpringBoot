package com.lucas.spring.h2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.spring.h2.api.model.Genre;
import com.lucas.spring.h2.api.service.GenreService;

@RestController
public class GenreController {
	@Autowired
	GenreService genreService;
	
	@PostMapping("/genre")
	public ResponseEntity<Genre> addGenre(@RequestBody Genre genre){
		return ResponseEntity.status(HttpStatus.CREATED).body(genreService.addGenre(genre));
	}
}
