package org.example.controller;
import org.example.Entity.JobCategory;
import org.example.Service.JobCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@RequestMapping("/api/job/category")

public class JobCategoryController {

    @Autowired

    private JobCategoryService jobCategoryService;

    @PostMapping("/add")

    public ResponseEntity<JobCategory> addCategory(@RequestBody JobCategory category) {

        JobCategory addedCategory = jobCategoryService.addCategory(category);

        return new ResponseEntity<>(addedCategory, HttpStatus.CREATED);

    }

    @GetMapping("/all")

    public ResponseEntity<List<JobCategory>> getAllCategories() {

        List<JobCategory> categories = jobCategoryService.getAllCategories();

        return new ResponseEntity<>(categories, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<String> deleteCategory(@PathVariable int id) {

        jobCategoryService.deleteCategory(id);

        return new ResponseEntity<>("Category deleted successfully", HttpStatus.OK);

    }

}
