package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.JobHistory;

public interface JobHistoryRepo extends JpaRepository<JobHistory, Integer> {

}
