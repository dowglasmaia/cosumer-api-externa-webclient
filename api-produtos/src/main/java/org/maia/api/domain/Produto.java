package org.maia.api.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto implements Serializable {

	private Long id;
	private String descricao;
	private Long idFornecedor;

}
