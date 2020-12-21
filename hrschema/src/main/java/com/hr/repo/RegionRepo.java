package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Regions;

public interface RegionRepo extends JpaRepository<Regions, Integer> {

}
