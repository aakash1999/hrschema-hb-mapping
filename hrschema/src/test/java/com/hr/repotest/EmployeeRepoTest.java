package com.hr.repotest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hr.entity.Departments;
import com.hr.entity.Employees;
import com.hr.entity.Jobs;
import com.hr.repo.EmployeeRepo;
import com.hr.repo.LocationRepo;

@SpringBootTest
public class EmployeeRepoTest {
	
	Logger logger = Logger.getLogger(LocationRepoTest.class.getName());
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private LocationRepo LocationRepo;
	
//	@Test
//	void saveEmployee() {
//		Jobs job = new Jobs(1, "PAT", 22000, 26000);
//		Departments department = new Departments(1, "CDE", null, LocationRepo.findById(1).get());
//		Employees employee = new Employees(1, "Aakash", "Nanda", "aakash@gmail.com", "7327844138", LocalDate.parse("2020-07-15"), 26000, 15, job, null, department);
//		employeeRepo.save(employee);
//	}
	
	@Test
	void getEmployeeTest() {
		Employees employee = employeeRepo.findById(1).get();
		logger.info("-----------------------Employee : " + employee);
		assertTrue(employee!=null);
	}
}
