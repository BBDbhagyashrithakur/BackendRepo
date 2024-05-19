package com.jobportal.dao;

import com.jobportal.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}
