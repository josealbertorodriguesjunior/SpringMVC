package com.juniorlima.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorlima.cobranca.modelo.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{
	
}
