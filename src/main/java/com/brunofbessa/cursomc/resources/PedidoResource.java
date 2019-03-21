package com.brunofbessa.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunofbessa.cursomc.domain.Pedido;
import com.brunofbessa.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired	
	private PedidoService service;
	
	// Abaixo um teste simples para verificar se o resource está respondendo adequadamente ao HTTP.
	// Atualização do endpoint com o id do objeto retornado pelo GET.
	// O tipo ResponseEntity encapsula muitas informações do retorno do verbo HTTP.
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}


