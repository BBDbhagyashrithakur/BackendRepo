package com.example.ATCProject.Service;

import com.example.ATCProject.Repository.StudentRepo;
import com.example.ATCProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            student.setStudent_Id(id);
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    public boolean deleteStudent(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
