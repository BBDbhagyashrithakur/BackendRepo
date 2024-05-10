package com.example.ATCProject.controller;

import com.example.ATCProject.Entity.Application;
import com.example.ATCProject.Service.Impl.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/add")
    public ResponseEntity<Application>addApplication(@RequestBody Application application)
    {
        Application application1=applicationService.addApplication(application);
        return  new ResponseEntity<>(application1 ,HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> applications = applicationService.getAllApplications();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable int id) {
        Application application = applicationService.findApplicationById(id);
        return new ResponseEntity<>(application, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteApplication(@PathVariable int id) {
        // Implement your logic to delete application
        applicationService.deleteApplicationById(id);
        return new ResponseEntity<>("Application deleted successfully", HttpStatus.OK);
    }
}
