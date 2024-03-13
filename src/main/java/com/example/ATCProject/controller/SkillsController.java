package com.example.ATCProject.controller;
import com.example.ATCProject.Service.SkillsService;
import com.example.ATCProject.model.Application;
import com.example.ATCProject.model.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    private SkillsService skillsService;
    @PostMapping("/add")
    public ResponseEntity<Skills>addSkills(@RequestBody Skills skills)
   {      return new  ResponseEntity<>(skillsService.AddSkills(skills),HttpStatus.CREATED);
   }
    @GetMapping("/all")
    public ResponseEntity<List<Skills>>GetAllSkills()
    {
        return  new ResponseEntity<>(new ArrayList<>(), HttpStatusCode.valueOf(200));
    }


}
