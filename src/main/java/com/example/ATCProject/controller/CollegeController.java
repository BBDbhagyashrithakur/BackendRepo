package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CollegeDTO;
import com.example.ATCProject.Service.Impl.CollageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private CollageService collageService;

    @PostMapping("/create")
    public CollegeDTO createCollege(@RequestBody CollegeDTO collegeDTO) {
        return collageService.createCollege(collegeDTO);
    }

    @GetMapping("/{id}")
    public CollegeDTO findCollegeById(@PathVariable int id) {
        return collageService.findCollegeById(id);
    }

    @GetMapping("/all")
    public List<CollegeDTO> getAllColleges() {
        return collageService.getAllColleges();
    }
}
