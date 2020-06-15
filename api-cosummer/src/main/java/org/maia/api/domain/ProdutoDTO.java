package org.maia.api.domain;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProdutoDTO{
	
	private Long id;
	private String descricao;
	private Long idFornecedor;
	
	@NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private Double	 precoVenda; 

}
