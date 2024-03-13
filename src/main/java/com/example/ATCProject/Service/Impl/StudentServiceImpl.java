package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.StudentDTO;
import com.example.ATCProject.Repository.StudentRepo;
import com.example.ATCProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepo studentRepository;



    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
