package org.maia.api.services;

import org.maia.api.domain.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class FerramentaServices {

	@Autowired
	private WebClient webClientProduto;

	@Autowired
	private WebClient webClientValoresProdutos;

	public ProdutoDTO obterProdutoPorIdFornecedor(Long id) {

		Mono<ProdutoDTO> monoProdutoDetalhe = this.webClientProduto.method(HttpMethod.GET) /* ou só .get() */
				.uri("/api-produtos/{id}", id).retrieve().bodyToMono(ProdutoDTO.class);

		Mono<ProdutoDTO> monoProdutoValor = this.webClientValoresProdutos.get().uri("/api/valores-produtos/{id}", id)
				.retrieve().bodyToMono(ProdutoDTO.class);

		/*
		 * monoFerramenta.subscribe(p -> { System.out.println("Finalizou de Verdade");
		 * });
		 * 
		 * System.out.println("Finalizou!");
		 *  
		 * ProdutoDTO result01 = monoProdutoDetalhe.block(); 
		 * ProdutoDTO result02 = monoProdutoValor.block();
		 */

		/* JUNTA AS DUAS REQUISIÇÕES PARA UM UNICO RETORNO */
		ProdutoDTO produto = Mono.zip(monoProdutoDetalhe, monoProdutoValor).map(result -> {
			result.getT1().setPrecoVenda(result.getT2().getPrecoVenda());
			return result.getT1();
		}).block();

		return produto;
	}
}
