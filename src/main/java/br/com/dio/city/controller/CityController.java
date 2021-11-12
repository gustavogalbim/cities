package br.com.dio.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.city.client.CityClient;
import br.com.dio.city.model.CityModel;

@RestController
@RequestMapping("search")
public class CityController {

	@Autowired
	private CityClient cityClient;
	
	
	@GetMapping("cities")
	public List<String> findAll() throws Exception{
		return cityClient.findAll();
	}
	
	@GetMapping("cities/{id}")
	public CityModel findById(@PathVariable("id") Long id) throws Exception {
	return cityClient.findById(id);
	}
}
