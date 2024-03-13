package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.StudentDTO;
import com.example.ATCProject.Repository.CollageRepo;
import com.example.ATCProject.Repository.StudentRepo;
import com.example.ATCProject.Repository.UserRepository;
import com.example.ATCProject.model.College;
import com.example.ATCProject.model.Student;
import com.example.ATCProject.model.User_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CollageRepo collageRepo;
    public StudentDTO createStudent(StudentDTO studentDTO){
        Optional<User_data> byId = userRepository.findById(studentDTO.getStudent_Id());
        if(byId.isEmpty()){
            System.out.println("user not available");
            return null;
        }
        Optional<College> byId1 = collageRepo.findById(studentDTO.getCollegeId());
        if(byId1.isEmpty()){
            System.out.println("user not available");
            return null;
        }
        Student s=new Student();
        s.setCollege(byId1.get());
        s.setUser_Id(byId.get());
        s.setResume(studentDTO.getResume());
        Student save = studentRepo.save(s);

        StudentDTO s1=new StudentDTO(save.getStudent_Id(),save.getResume(),save.getUser_Id().getUser_Id(),save.getCollege().getCollege_Id());


    }
}
