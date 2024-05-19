package org.example.Service;

import org.example.Entity.JobCategory;
import org.example.Exception.CategoryNotFoundException;
import org.example.dao.JobCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobCategoryServiceImpl implements JobCategoryService {

    @Autowired
    private JobCategoryDao jobCategoryDao;

    @Override
    public JobCategory addCategory(JobCategory category) {

        return  jobCategoryDao.save(category);

    }

    @Override

    public List<JobCategory> getAllCategories() {

        return jobCategoryDao.findAll();

    }

    @Override

    public void deleteCategory(int id) {

        if (!jobCategoryDao.existsById(id)) {

            throw new CategoryNotFoundException("Category with id " + id + " not found");

        }

        jobCategoryDao.deleteById(id);

    }

}



