package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.CollegeDTO;
import com.example.ATCProject.Repository.CollageRepo;
import com.example.ATCProject.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollageService {

    @Autowired
    private CollageRepo collageRepo;

    public College createCollage(CollegeDTO collegeDTO) {

        College c = new College();
        c.setCollege_name(collegeDTO.getCollege_name());
        c.setEmail(collegeDTO.getEmail());
        c.setPhone_no(collegeDTO.getPhone_no());
        if(c==null) {
            System.out.println("add college");
        }
        return collageRepo.save(c);
    }
}
