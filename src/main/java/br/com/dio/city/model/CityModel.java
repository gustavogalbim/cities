package br.com.dio.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityModel {

	private Long id;
	private String nome;
	
	private MicrorRegiaoModel microrregiao;

}
