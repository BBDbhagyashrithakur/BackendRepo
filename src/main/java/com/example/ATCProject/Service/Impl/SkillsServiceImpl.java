package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.Repository.SkillsRepo;
import com.example.ATCProject.Service.SkillsService;
import com.example.ATCProject.model.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServiceImpl implements SkillsService {
    @Autowired
    private  SkillsRepo skillsRepo;
    @Override
    public Skills AddSkills(Skills skills) {
        return skillsRepo.save(skills);
    }


}
