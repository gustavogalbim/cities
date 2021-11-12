package br.com.dio.city.client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.dio.city.model.CityModel;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class CityClient {

	public List<String> findAll() throws Exception {
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<CityModel[]> responseEntity = 
				    restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/municipios", CityModel[].class); 
			CityModel[] userArray = responseEntity.getBody();
				  return Arrays.stream(userArray) 
				    .map(CityModel::getNome) 
				    .collect(Collectors.toList());
			
		} catch(Exception e) {
			throw new Exception("It was not possible call list");
		}

	}

	public CityModel findById(Long id) throws Exception {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			
			RestTemplate restTemplate = new RestTemplate();
			
			CityModel cityModel = restTemplate.getForObject("https://servicodados.ibge.gov.br/api/v1/localidades/municipios/{municipio}", CityModel.class, id);

			return cityModel;
		} catch(Exception e) {
			throw new Exception("It was not possible call by Id");
		}
	}

	
	
}
