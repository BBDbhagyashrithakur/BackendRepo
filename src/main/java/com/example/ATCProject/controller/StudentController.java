package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.StudentDTO;
import com.example.ATCProject.Repository.StudentRepo;
import com.example.ATCProject.Service.Impl.StudentService;
import com.example.ATCProject.model.Student;
import com.example.ATCProject.model.User_data;
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
    StudentRepo studentRepo;
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO){
        StudentDTO student = studentService.createStudent(studentDTO);
        return new ResponseEntity<>(student,HttpStatus.CREATED);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>>GetAllStudent()
    {   List<Student> student = studentRepo.findAll();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
