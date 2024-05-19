package org.example.Service;

import org.example.Entity.Job;
import org.example.Exception.JobNotFoundException;
import org.example.dao.JobDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public  class JobServiceImpl implements JobService{
    @Autowired
   private JobDao jobDao;
    @Override
    public Job postJob(Job job) {

        // Additional validation logic can be added here
        return jobDao.save(job);

    }
    @Override
    public Job getJobById(int id) {

        return jobDao.findById(id)

                .orElseThrow(() -> new JobNotFoundException("Job with id " + id + " not found"));

    }


    @Override
    public Job addJobs(Job jobPost) {
        return  jobDao.save(jobPost);
    }

    public List<Job> getAllJobs() {

        return jobDao.findAll();

    }

    @Override
    public Job findJobsById(int id) {
        return null;
    }

    @Override
    public void deleteJobPostById(int id) {

    }

    @Override
    public void deleteJob(int id) {

        if (!jobDao.existsById(id)) {

            throw new JobNotFoundException("Job with id " + id + " not found");

        }
        jobDao.deleteById(id);

    }

//    @Override
//    public int saveAddress(Address address) {
//        Address savedAddress = addressDao.save(address);
//        return savedAddress.getId();
//    }

}
