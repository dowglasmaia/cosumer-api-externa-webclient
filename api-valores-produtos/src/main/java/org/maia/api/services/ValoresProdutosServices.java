package org.maia.api.services;

import org.maia.api.domain.ValoresProduto;
import org.maia.api.repository.ValoresProdutoRespository;
import org.springframework.stereotype.Service;

@Service
public class ValoresProdutosServices {
	
	//@Autowired
	private ValoresProdutoRespository respository;

	
	public ValoresProduto obterValorProdutoPorCodProduto(Long id) {
		
		/* simulando um valor da base de dados*/
		ValoresProduto p = new ValoresProduto(1l, 1l, 500.0, 890.99);
		
		return p;
		
	}
}
	