package com.brunofbessa.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunofbessa.cursomc.domain.Pagamento;


// A interface abaixo é capaz de acessar a camada de dados da classe Pagamento, identificando os objetos por id.
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
	
}
