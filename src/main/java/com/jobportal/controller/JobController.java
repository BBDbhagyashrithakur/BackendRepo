
package com.jobportal.controller;

import com.jobportal.Entity.Job;
import com.jobportal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/add")
    public ResponseEntity<Job> addJobPost(@RequestBody Job jobPost) {
        System.out.println("request coming");
        Job addedJobs = jobService.addJobs(jobPost);
        System.out.println(jobPost);

        return new ResponseEntity<>(addedJobs,HttpStatus.CREATED);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Job>> getAllJobs() {
        List<Job> jobPosts = jobService.getAllJobs();
        return new ResponseEntity<>(jobPosts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> findJobsById(@PathVariable int id) {
        Job jobPost = jobService.findJobsById(id);
        return new ResponseEntity<>(jobPost, HttpStatus.OK);
    }
//    @PutMapping("/{id}")
//    public ResponseEntity<Job> updateJobPost(
//            @PathVariable int id,
//            @RequestBody Job updatedJobPost
//    )
//    {
//        Job jobPost = jobService.updateJobPost(id, updatedJobPost);
//        return new ResponseEntity<>(jobPost, HttpStatus.OK);
//    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobPostById(@PathVariable int id) {
        jobService.deleteJobPostById(id);
        return new ResponseEntity<>("Job post deleted successfully", HttpStatus.OK);
    }


    @GetMapping("/types")
    public ResponseEntity<String[]> getAllJobTypes() {
        String[] jobTypes = Arrays.stream(Job.JobType.values())
                .map(Enum::name)
                .toArray(String[]::new);
        return ResponseEntity.ok(jobTypes);
    }

    @GetMapping("/experienceLevels")
    public ResponseEntity<String[]> getAllExperienceLevels() {
        String[] experienceLevels = Arrays.stream(Job.ExperienceLevel.values())
                .map(Enum::name)
                .toArray(String[]::new);
        return ResponseEntity.ok(experienceLevels);
    }


    @GetMapping("/salaryRanges")
    public ResponseEntity<String[]> getAllSalaryRanges() {
        String[] salaryRanges = Arrays.stream(Job.SalaryRange.values())
                .map(Enum::name)
                .toArray(String[]::new);
        return ResponseEntity.ok(salaryRanges);
    }

//    @PostMapping("/post/address")
//    public ResponseEntity<Job> postJob(@RequestBody Job job) {
//
//        Address address = job.getAddress();
//        System.out.println(address);
//        int savedAddress = jobService.saveAddress(address);
//        job.setAddress(savedAddress);
//        // Save the job
//        Job savedJob = jobService.postJob(job);
//        return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
//    }

}



