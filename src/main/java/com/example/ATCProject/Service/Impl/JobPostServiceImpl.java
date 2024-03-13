package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.Repository.JobPostRepo;
import com.example.ATCProject.Service.JobPostService;
import com.example.ATCProject.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostServiceImpl implements JobPostService {
    @Autowired
    private JobPostRepo jobPostRepository;

    @Override
    public List<JobPost> getAllJobPosts() {
        return jobPostRepository.findAll();
    }

    @Override
    public JobPost getJobPostById(Long id) {
        Optional<JobPost> optionalJobPost = jobPostRepository.findById(id);
        return optionalJobPost.orElse(null);
    }

    @Override
    public JobPost createJobPost(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }

    @Override
    public JobPost updateJobPost(Long id, JobPost jobPost) {
        Optional<JobPost> optionalJobPost = jobPostRepository.findById(id);
        if (optionalJobPost.isPresent()) {
            jobPost.setJob_Id(id);
            return jobPostRepository.save(jobPost);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteJobPost(Long id) {
        Optional<JobPost> optionalJobPost = jobPostRepository.findById(id);
        if (optionalJobPost.isPresent()) {
            jobPostRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
