package com.hr.repotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hr.entity.Countries;
import com.hr.entity.Regions;
import com.hr.repo.CountryRepo;
import com.hr.repo.RegionRepo;

@SpringBootTest
class CountryRepoTest {
	
	Logger logger = Logger.getLogger(CountryRepoTest.class.getName());
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private RegionRepo regionRepo;
	
//	@Test
//	@Order(1)
//	void saveCountryTest() {
//		Regions region = regionRepo.findById(1).get();
//		Countries countries = new Countries(1, "India", region);
//		countryRepo.save(countries);
//		assertTrue(true);
//	}
	
	@Test
	@Order(2)
	void getCountryTest() {
		Countries country = countryRepo.findById(1).get();
		logger.info("------------------Country : " + country);
		logger.info("Region of the country : " + country.getRegion());
		assertTrue(country!=null);
	}

}
