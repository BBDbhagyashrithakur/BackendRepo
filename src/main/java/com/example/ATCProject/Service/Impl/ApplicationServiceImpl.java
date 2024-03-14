package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.ApplicationDTO;
import com.example.ATCProject.Entity.Application;
import com.example.ATCProject.Entity.Users;
import com.example.ATCProject.Repository.ApplicationRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ApplicationRepo applicationRepository;


    public List<ApplicationDTO> getAllApplications() {

        List<Application> list = applicationRepository.findAll();
        List<ApplicationDTO> applicationsDTO = new ArrayList<>();
        for (Application l : list) {
            applicationsDTO.add(modelMapper.map(l, ApplicationDTO.class));
        }
        return applicationsDTO;
    }


    public ApplicationDTO getApplicationById(int id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        return modelMapper.map(optionalApplication.get(),ApplicationDTO.class);
    }


}



