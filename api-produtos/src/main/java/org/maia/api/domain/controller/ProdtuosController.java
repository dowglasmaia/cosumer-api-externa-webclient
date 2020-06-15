package org.maia.api.domain.controller;


import org.maia.api.domain.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-produtos")
public class ProdtuosController {


	@GetMapping("/{id}")
	public ResponseEntity<Produto> obterFerramentasPorIdFornecedor(@PathVariable Long id) {
		
		Produto obj = new Produto(1L, "The Premium AMD Wraith Prism Cooler", 1l);

		return ResponseEntity.ok().body(obj);

	}

}
