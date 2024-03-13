package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.Repository.ApplicationRepo;
import com.example.ATCProject.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl {

    @Autowired
    private ApplicationRepo applicationRepository;


    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }


    public Application getApplicationById(Long id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        return optionalApplication.orElse(null);
    }


    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }


    public Application updateApplication(Long id, Application application) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        if (optionalApplication.isPresent()) {
            application.setApplication_Id(id);
            return applicationRepository.save(application);
        } else {
            return null; // Or throw an exception if needed
        }
    }
}

