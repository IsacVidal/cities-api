package com.github.isacvidal.citiesapi.countries.repository;

import com.github.isacvidal.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
