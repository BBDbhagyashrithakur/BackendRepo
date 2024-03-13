package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.StudentDTO;
import com.example.ATCProject.Service.Impl.StudentService;
import com.example.ATCProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO){
        return studentService.createStudent(studentDTO);

    }
}
