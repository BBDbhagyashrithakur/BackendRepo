package org.example.dao;


import org.example.Entity.JobCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobCategoryDao extends JpaRepository<JobCategory,Integer> {

   // CompanyDTO  Email();
}
