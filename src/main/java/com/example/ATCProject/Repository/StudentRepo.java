package com.example.ATCProject.Repository;

import com.example.ATCProject.DTO.StudentDTO;
import com.example.ATCProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<Student,Long> {
}
