package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Countries;

public interface CountryRepo extends JpaRepository<Countries, Integer> {

}
