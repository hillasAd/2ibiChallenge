package com.ibi.api.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibi.api.model.Country;

@Repository
public interface CountryService extends JpaRepository<Country, Long> {

	
}
