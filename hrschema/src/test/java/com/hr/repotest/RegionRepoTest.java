package com.hr.repotest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hr.entity.Regions;
import com.hr.repo.RegionRepo;

@SpringBootTest
public class RegionRepoTest {
	
	Logger logger = Logger.getLogger(RegionRepoTest.class.getName());
	
	@Autowired
	private RegionRepo regionRepo;
	
	@Test
	@Order(1)
	public void saveRegion() {
		Regions regions = new Regions();
		regions.setName("South America");
		regionRepo.save(regions);
	}
	
	@Test
	@Order(2)
	public void getRegion() {
		Regions region = regionRepo.findById(1).get();
		logger.info("Region : " + region);
		assertTrue(region!=null);
	}
}
