package com.ibi.api.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibi.api.model.Country;

@Service
public class CountryServiceImpl {

	private static final Logger LOG = Logger.getLogger(CountryServiceImpl.class);
	@Autowired
	private CountryService countryService;

	public List<Country> listAll() {
		List<Country> list = null;
		try {
			LOG.info("Listar todos os países anteriormente criados.");
			list = countryService.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Ocorreu algum erro ao tentar listar todos paises registados...");
			LOG.error("Error Listing all Countries: " + e);
		}
		return list;
	}

	public Country add(@RequestBody Country country) {
		Country countrySaved = null;
		try {
			LOG.info("Criar um novo país a partir da API criada com todas as suas propriedades.");
			countrySaved = countryService.save(country);
			return countrySaved;
		} catch (Exception e) {
			System.out.println(
					"Ocorreu algum erro ao tentar criar o país. \n Verifique se todos parametros foram enviados (name,capital,region,subregion,area (deve ser um numero)),\n  caso contrario, o país já foi registado! Liste todos paises para verificar");
			LOG.error("Error Creating Country: " + e);
		}
		return countrySaved;
	}

	public Country update(@PathVariable(name = "id", required = true) Long id, @RequestBody Country country) {
		Country c_updated = null;
		try {
			LOG.info("Modificar os dados de um país anteriormente criado.");

			var c = countryService.findById(id);
			if (c.isPresent()) {
				var countrySave = c.get();
				countrySave.setName(country.getName());
				countrySave.setCapital(country.getCapital());
				countrySave.setRegion(country.getRegion());
				countrySave.setSubregion(country.getSubregion());
				countrySave.setArea(country.getArea());
				c_updated = countryService.save(countrySave);

			} else {
				System.out.println("Codigo do país não foi encontrado!");
			}

		} catch (Exception e) {
			System.out.println(
					"Ocorreu algum erro ao tentar actualizar o país informado pelo id. Confirme se o id informado existe ou se o atributo área é um numero.");
			LOG.error("Error Updating Country: " + e);
		}
		return c_updated;
	}

	public void delete(@PathVariable(name = "id", required = true) Long id) {
		try {
			LOG.info("Eliminar um país anteriormente criado.");
			countryService.deleteById(id);
		} catch (Exception e) {
			System.out.println(
					"Ocorreu algum erro ao tentar eliminar o país informado pelo id. Confirme se o id informado existe.");
			LOG.error("Error deleting Country: " + e);
		}
	}

	public List<Country> sortBy(@PathVariable(name = "parameter", required = true) String parameter) {
		List<Country> list = null;
		try {
			LOG.info(
					"Ordenar a lista dos países por qualquer uma das suas propriedades (name,capital,region,subregion,area).");
			list = countryService.findAll(Sort.by(parameter));
			return list;

		} catch (Exception e) {
			System.out.println("Ocorreu algum erro ao tentar ordenar a lista dos países por " + parameter
					+ "\n Verifique se o parametro inserido consta na lista (name,capital,region,subregion,area).");
			LOG.error("Error sorting Country by parameter: " + e);
		}
		return list;
	}

}
