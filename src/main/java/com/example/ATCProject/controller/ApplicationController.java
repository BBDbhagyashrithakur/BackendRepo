package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.ApplicationDTO;
import com.example.ATCProject.Entity.Application;
import com.example.ATCProject.Service.Impl.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationServiceImpl applicationService;

    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/{id}")
    public ApplicationDTO getApplicationById(@PathVariable int id) {
        return applicationService.getApplicationById(id);
    }



}
