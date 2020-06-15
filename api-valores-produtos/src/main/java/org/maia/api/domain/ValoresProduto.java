package org.maia.api.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class ValoresProduto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long codProduto;
	
	//private String descricao;
	
	@Column(precision = 12, scale = 2, nullable = false)
	@NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private Double precoCompra;
	
	@Column(precision = 12, scale = 2, nullable = false)
	@NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private Double precoVenda;
	

}
