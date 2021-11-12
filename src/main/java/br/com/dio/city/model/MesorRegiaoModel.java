package br.com.dio.city.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MesorRegiaoModel {

	private Long id;
	private String nome;
	
	@JsonAlias(value = "UF")
	private UfModel UF;
	
}
