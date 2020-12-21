package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Locations;

public interface LocationRepo extends JpaRepository<Locations, Integer>{

}
