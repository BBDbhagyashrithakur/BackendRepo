package com.example.ATCProject.Repository;


import com.example.ATCProject.DTO.CollegeDTO;
import com.example.ATCProject.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollageRepo extends JpaRepository<College,Long> {
}
