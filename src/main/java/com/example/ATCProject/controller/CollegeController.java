package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CollegeDTO;
import com.example.ATCProject.Service.Impl.CollageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public ResponseEntity<CollegeDTO> findCollegeById(@PathVariable int id) {

      //  return collageService.findCollegeById(id);
        try {
            CollegeDTO collegeDTO = collageService.findCollegeById(id);
            return new ResponseEntity<>(collegeDTO, HttpStatus.OK);
        } catch (ResponseStatusException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "College not found", ex);
        }
    }

    @GetMapping("/all")
    public List<CollegeDTO> getAllColleges() {
        return collageService.getAllColleges();
    }
}
