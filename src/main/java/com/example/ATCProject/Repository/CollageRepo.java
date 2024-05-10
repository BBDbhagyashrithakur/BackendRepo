package com.example.ATCProject.Repository;


import com.example.ATCProject.Entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollageRepo extends JpaRepository<College,Integer> {
}
