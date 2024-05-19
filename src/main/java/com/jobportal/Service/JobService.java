package com.jobportal.Service;

import com.jobportal.Entity.Job;

import java.util.List;

public interface JobService {

    Job postJob(Job job);

        Job getJobById(int id);

        Job addJobs(Job jobPost);
        List<Job> getAllJobs();
        Job findJobsById(int id);
         void deleteJobPostById(int id);


          void deleteJob(int id);
}
