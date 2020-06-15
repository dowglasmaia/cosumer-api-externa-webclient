package org.maia.api.controller;

import org.maia.api.domain.ValoresProduto;
import org.maia.api.services.ValoresProdutosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/valores-produtos")
public class ValoresProdtuosController {

	@Autowired
	private ValoresProdutosServices valoresServices;

	@GetMapping("/{id}")
	public ResponseEntity<ValoresProduto> obterFerramentasPorIdFornecedor(@PathVariable Long id) {
		ValoresProduto obj = valoresServices.obterValorProdutoPorCodProduto(id);

		return ResponseEntity.ok().body(obj);

	}

}
