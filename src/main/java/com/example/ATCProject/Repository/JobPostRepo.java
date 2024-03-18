package com.example.ATCProject.Repository;

import com.example.ATCProject.Entity.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepo extends JpaRepository<JobPost,Integer> {
}
