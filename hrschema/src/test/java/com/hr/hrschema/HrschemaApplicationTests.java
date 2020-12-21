package com.hr.hrschema;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hr.entity.Regions;
import com.hr.repo.RegionRepo;

@SpringBootTest
class HrschemaApplicationTests {
	
	@Autowired
	private RegionRepo regionRepo;

	@Test
	void contextLoads() {
		Regions regions = new Regions();
		regions.setName("Asia");
		regionRepo.save(regions);
	}

}
