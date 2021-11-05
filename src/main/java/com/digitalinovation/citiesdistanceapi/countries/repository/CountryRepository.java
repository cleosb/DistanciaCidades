package com.digitalinovation.citiesdistanceapi.countries.repository;

import com.digitalinovation.citiesdistanceapi.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
