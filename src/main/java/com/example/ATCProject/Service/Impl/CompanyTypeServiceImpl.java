package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.Repository.CompanyRepo;
import com.example.ATCProject.Repository.CompanyTypeRepository;
import com.example.ATCProject.Service.CompanyTypeService;
import com.example.ATCProject.model.Company_type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyTypeServiceImpl implements CompanyTypeService {
    @Autowired
    private   CompanyTypeRepository companyTypeRepository;
    @Override
    public Company_type AddCompanyType(Company_type company_type) {
        return companyTypeRepository.save(company_type);
    }

    public List<Company_type>getAll()
    {
        return companyTypeRepository.findAll();
    }
}
