package org.example.dao;

import org.example.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}
