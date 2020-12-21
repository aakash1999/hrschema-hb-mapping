package com.hr.repotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hr.entity.Countries;
import com.hr.entity.Locations;
import com.hr.repo.CountryRepo;
import com.hr.repo.LocationRepo;

@SpringBootTest
class LocationRepoTest {

	Logger logger = Logger.getLogger(LocationRepoTest.class.getName());

	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private LocationRepo locationRepo;

//	@Test
//	void saveLocationTest() {
//		Countries country = countryRepo.findById(1).get();
//		Locations location = new Locations(1, "Hinjewadi", 1234, "Pune", "Maharastra", country);
//		locationRepo.save(location);
//		assertTrue(true);
//	}
	
	@Test
	void getLocationTest() {
		Locations location = locationRepo.findById(1).get();
		logger.info("------------ Location :----" + location);
		assertTrue(location!=null);
	}

}
