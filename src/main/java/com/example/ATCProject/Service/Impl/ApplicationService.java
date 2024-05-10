
package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.Entity.Application;
import com.example.ATCProject.Repository.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepo applicationRepository;
    private static final String DEFAULT_STATUS = "pending";

    public Application addApplication(Application application) {
        if (application.getStatus() == null || application.getStatus().isEmpty()){
            application.setStatus(DEFAULT_STATUS);
        }

        return applicationRepository.save(application);
    }
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application findApplicationById(int id) {
        Optional<Application> application = applicationRepository.findById(id);
        if (application.isPresent()) {
            return application.get();
        } else {
            throw new RuntimeException("Application not found with id: " + id);
        }
    }

    public Application updateApplicationStatus(int id, String status) {
        Optional<Application> applicationOptional = applicationRepository.findById(id);
        if (applicationOptional.isPresent()) {
            Application application = applicationOptional.get();
            application.setStatus(status);
            return applicationRepository.save(application);
        } else {
            throw new RuntimeException("Application not found with id: " + id);
        }
    }
    public void deleteApplicationById(int id) {
        Application application = findApplicationById(id);
        applicationRepository.delete(application);
    }

    // Add other methods as needed
}


