package com.lucas.spring.h2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.spring.h2.api.model.Locacao;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long>{

}
