package com.example.ATCProject.Repository;

import com.example.ATCProject.model.Company_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyTypeRepository extends JpaRepository<Company_type,Long> {

}
