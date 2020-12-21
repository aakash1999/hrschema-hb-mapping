package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Departments;

public interface DepartmentRepo extends JpaRepository<Departments, Integer> {

}
