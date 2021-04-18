package com.ibi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ibi.api.model.Country;
import com.ibi.api.service.CountryServiceImpl;

@RestController
@RequestMapping("/challengeAPI")
public class CountryController {

	@Autowired
	private CountryServiceImpl countryService;

	@GetMapping(path = "/countries")
	public List<Country> listAll() {
		return countryService.listAll();
	}

	@PostMapping(path = "/country/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Country add(@RequestBody Country country) {
		return countryService.add(country);
	}

	@PutMapping(path = "/country/update/{id}")
	public Country update(@PathVariable(name = "id", required = true)Long id, @RequestBody Country country) throws Exception {
		return countryService.update(id,country);
	}

	@DeleteMapping(path = "/country/delete/{id}")
	public void delete(@PathVariable(name = "id", required = true) Long id) {
		countryService.delete(id);
	}

	@GetMapping(path = "/country/orderBy/{parameter}")
	public List<Country> orderBy(@PathVariable(name = "parameter", required = true) String parameter) {
		return countryService.sortBy(parameter);
	}

}
