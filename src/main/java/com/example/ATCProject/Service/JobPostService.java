package com.example.ATCProject.Service;

import com.example.ATCProject.model.JobPost;

import java.util.List;

public interface JobPostService {
    List<JobPost> getAllJobPosts();

    JobPost getJobPostById(Long id);

    JobPost createJobPost(JobPost jobPost);

    JobPost updateJobPost(Long id, JobPost jobPost);

    boolean deleteJobPost(Long id);
}
