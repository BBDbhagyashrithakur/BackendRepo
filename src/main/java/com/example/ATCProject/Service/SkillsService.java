package com.example.ATCProject.Service;

import com.example.ATCProject.Repository.SkillsRepo;
import com.example.ATCProject.model.Skills;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SkillsService {

    Skills AddSkills(Skills skills);

}

