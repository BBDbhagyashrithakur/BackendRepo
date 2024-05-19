package com.jobportal.Service;

import com.jobportal.Entity.JobCategory;

import java.util.List;

public interface JobCategoryService {
    JobCategory addCategory(JobCategory category);
    List<JobCategory> getAllCategories();
    void deleteCategory(int id);
}