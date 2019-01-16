package com.brunofbessa.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunofbessa.cursomc.domain.Cidade;


// A interface abaixo é capaz de acessar a camada de dados da classe Cidade, identificando os objetos por id.
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
