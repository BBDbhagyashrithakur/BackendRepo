package com.example.ATCProject.controller;
import com.example.ATCProject.Service.JobPostService;
import com.example.ATCProject.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobPosts")
public class JobPostController {
    @Autowired
    private JobPostService jobPostService;

    @GetMapping("/all")
    public List<JobPost> getAllJobPosts() {
        return jobPostService.getAllJobPosts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPost> getJobPostById(@PathVariable Long id) {
        JobPost jobPost = jobPostService.getJobPostById(id);
        if (jobPost != null) {
            return new ResponseEntity<>(jobPost, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<JobPost> createJobPost(@RequestBody JobPost jobPost) {
        JobPost createdJobPost = jobPostService.createJobPost(jobPost);
        return new ResponseEntity<>(createdJobPost, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobPost> updateJobPost(@PathVariable Long id, @RequestBody JobPost jobPost) {
        JobPost updatedJobPost = jobPostService.updateJobPost(id, jobPost);
        if (updatedJobPost != null) {
            return new ResponseEntity<>(updatedJobPost, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobPost(@PathVariable Long id) {
        boolean deleted = jobPostService.deleteJobPost(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
