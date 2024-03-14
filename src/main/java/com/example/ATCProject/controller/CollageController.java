package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CollegeDTO;
import com.example.ATCProject.Repository.CollageRepo;
import com.example.ATCProject.Service.Impl.CollageService;
import com.example.ATCProject.model.College;
import com.example.ATCProject.model.User_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collage")
public class CollageController {
    @Autowired
    CollageService collageService;
    @Autowired
    CollageRepo collageRepo;

//    @PostMapping("/create")
//    public CollegeDTO createCollage(@RequestBody CollegeDTO collegeDTO){
//        return new CollegeDTO();
//    }
@PostMapping("/create")
public ResponseEntity<CollegeDTO> createCollege(@RequestBody CollegeDTO collegeDTO) {
    College college = collageService.createCollage(collegeDTO);
    if (college != null) {
        return new ResponseEntity<>(new CollegeDTO(college), HttpStatus.CREATED);
    } else {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

}
