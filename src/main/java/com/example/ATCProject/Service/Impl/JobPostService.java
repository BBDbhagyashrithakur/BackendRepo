package com.example.ATCProject.Service.Impl;
import com.example.ATCProject.Entity.JobPost;
import com.example.ATCProject.Repository.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostService {
    @Autowired
    JobPostRepo jobPostRepo;
    public JobPost addJobs(JobPost jobPost) {

        return jobPostRepo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobPostRepo.findAll();
    }
    public JobPost findJobsById(int id) {
        Optional<JobPost> jobPost = jobPostRepo.findById(id);
        if (jobPost.isPresent()) {
            return jobPost.get();
        } else {
            throw new RuntimeException("JobPost not found with id: " + id);
        }
    }
    public JobPost updateJobPost(int  id, JobPost updatedJobPost) {
        JobPost j = findJobsById(id);
        j.setTitle(updatedJobPost.getTitle());
        j.setDescription(updatedJobPost.getDescription());
        j.setJob_location(updatedJobPost.getJob_location());
        return jobPostRepo.save(j);
    }
    public void deleteJobPostById(int id) {
        JobPost jobPost = findJobsById(id);
        jobPostRepo.delete(jobPost);
    }

}
