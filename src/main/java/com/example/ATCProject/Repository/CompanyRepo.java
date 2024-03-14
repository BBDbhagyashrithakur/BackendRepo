package com.example.ATCProject.Repository;

import com.example.ATCProject.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository <Company,Integer>{

   // CompanyDTO  Email();
}
