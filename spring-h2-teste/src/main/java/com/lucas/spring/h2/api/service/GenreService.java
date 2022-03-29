package com.lucas.spring.h2.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.spring.h2.api.model.Genre;
import com.lucas.spring.h2.api.repository.GenreRepository;

@Service
public class GenreService{
	@Autowired
	GenreRepository genreRepository;
	
	public Genre addGenre(Genre genre) {
		Genre g = new Genre();
		g.setId(genre.getId());
		return genreRepository.save(g);
	}
	
}
