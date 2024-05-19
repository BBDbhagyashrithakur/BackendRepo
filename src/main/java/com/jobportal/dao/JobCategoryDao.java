package com.jobportal.dao;


import com.jobportal.Entity.JobCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobCategoryDao extends JpaRepository<JobCategory,Integer> {

   // CompanyDTO  Email();
}
