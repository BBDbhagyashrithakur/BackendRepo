package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CollegeDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collage")
public class CollageController {
    @PostMapping("/create")
    public CollegeDTO createCollage(@RequestBody CollegeDTO collegeDTO){
        return new CollegeDTO();
    }
}
