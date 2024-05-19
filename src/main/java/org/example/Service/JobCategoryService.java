package org.example.Service;

import org.example.Entity.JobCategory;

import java.util.List;

public interface JobCategoryService {
    JobCategory addCategory(JobCategory category);
    List<JobCategory> getAllCategories();
    void deleteCategory(int id);
}