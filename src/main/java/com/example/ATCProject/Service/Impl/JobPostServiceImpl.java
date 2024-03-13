package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.JobPostDTO;
import com.example.ATCProject.Repository.CompanyRepo;
import com.example.ATCProject.Repository.JobPostRepo;
import com.example.ATCProject.model.Company;
import com.example.ATCProject.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class JobPostServiceImpl implements JobPostService {
    @Autowired
    private JobPostRepo jobPostRepository;
    @Autowired
    private CompanyRepo companyRepo;

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
    public JobPost createJobPost(JobPostDTO jobPost) {
        Optional<Company> byId = companyRepo.findById(jobPost.getCompany_id());
        if(byId.isEmpty()){
            System.out.println("compnay is not present ");
            return null;
        }
        JobPost j =new JobPost();
        j.setJob_location(jobPost.getJob_location());
        j.setCompany(byId.get());
        j.setModified_date(new Date());
        j.setCreated_date(LocalDateTime.now());
        jobPostRepository.save(j);
        return  null;

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
