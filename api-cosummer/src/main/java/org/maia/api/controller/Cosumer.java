package org.maia.api.controller;

import org.maia.api.domain.ProdutoDTO;
import org.maia.api.services.FerramentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-consumer")
public class Cosumer {

	@Autowired
	private FerramentaServices services;
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<ProdutoDTO>getProdutoPorIdFornecedor( @PathVariable Long id ){
		
		ProdutoDTO result = services.obterProdutoPorIdFornecedor(id);
		return ResponseEntity.ok().body(result);
	}
	
	
	
	

	@GetMapping("/teste")
	public String getTest() {
		return "Teste ok";
	}
}
