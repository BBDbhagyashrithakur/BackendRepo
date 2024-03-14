package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.CollegeDTO;
import com.example.ATCProject.Repository.CollageRepo;
import com.example.ATCProject.Entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CollageService {

    @Autowired
    private CollageRepo collegeRepository;

    public CollegeDTO createCollege(CollegeDTO collegeDTO) {
        College college = College.builder()
                .name(collegeDTO.getName())
                .email(collegeDTO.getEmail())
                .phoneNumber(collegeDTO.getPhoneNumber())
                .build();
        college = collegeRepository.save(college);
        return collegeDTO;
    }

    public CollegeDTO findCollegeById(int id) {
        College college = collegeRepository.findById(id).orElse(null);
        if (college != null) {
            return CollegeDTO.builder()
                    .name(college.getName())
                    .email(college.getEmail())
                    .phoneNumber(college.getPhoneNumber())
                    .build();
        }
        return null;
    }

    public List<CollegeDTO> getAllColleges() {
        List<College> colleges = collegeRepository.findAll();
        List<CollegeDTO> collegeDTOs = new ArrayList<>();
        for (College college : colleges) {
            collegeDTOs.add(CollegeDTO.builder()
                    .name(college.getName())
                    .email(college.getEmail())
                    .phoneNumber(college.getPhoneNumber())
                    .build());
        }
        return collegeDTOs;
    }
}
