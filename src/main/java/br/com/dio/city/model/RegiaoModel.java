package br.com.dio.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegiaoModel {

	private Integer id;
	private String sigla;
	private String nome;
	
}
