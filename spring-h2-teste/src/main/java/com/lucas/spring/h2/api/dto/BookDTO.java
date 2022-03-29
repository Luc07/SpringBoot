package com.lucas.spring.h2.api.dto;

import lombok.Data;

@Data
public class BookDTO {
	private int bookId;
	private String bookName;
	private int idPerson;
	private int idGenre;
}
