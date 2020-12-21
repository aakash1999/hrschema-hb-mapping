package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Jobs;

public interface JobRepo extends JpaRepository<Jobs, Integer>{

}
