package com.example.ATCProject.Repository;

import com.example.ATCProject.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepo extends JpaRepository<Application,Long> {

}
