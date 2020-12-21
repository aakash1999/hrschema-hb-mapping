package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Employees;

public interface EmployeeRepo extends JpaRepository<Employees, Integer> {

}
