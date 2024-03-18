
package com.example.ATCProject.controller;
import com.example.ATCProject.Entity.JobPost;
import com.example.ATCProject.Service.Impl.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobPostController {

    @Autowired
    private JobPostService jobPostService;

    @PostMapping("/add")
    public ResponseEntity<JobPost> addJobPost(@RequestBody JobPost jobPost) {
        JobPost addedJobPost = jobPostService.addJobs(jobPost);
        return new ResponseEntity<>(addedJobPost, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<JobPost>> getAllJobs() {
        List<JobPost> jobPosts = jobPostService.getAllJobs();
        return new ResponseEntity<>(jobPosts, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<JobPost> findJobsById(@PathVariable int id) {
        JobPost jobPost = jobPostService.findJobsById(id);
        return new ResponseEntity<>(jobPost, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<JobPost> updateJobPost(
            @PathVariable int id,
            @RequestBody JobPost updatedJobPost
    ) {
        JobPost jobPost = jobPostService.updateJobPost(id, updatedJobPost);
        return new ResponseEntity<>(jobPost, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobPostById(@PathVariable int id) {
        jobPostService.deleteJobPostById(id);
        return new ResponseEntity<>("Job post deleted successfully", HttpStatus.OK);
    }
}