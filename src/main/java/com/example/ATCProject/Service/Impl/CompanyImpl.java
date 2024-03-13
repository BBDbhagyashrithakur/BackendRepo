package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.CompanyDTO;
import com.example.ATCProject.Repository.CompanyRepo;
import com.example.ATCProject.model.Company;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CompanyImpl implements CompanyService {
    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private CompanyTypeRepository companyTypeRepository;


    @Override
    public CompanyDTO AddCompany(CompanyDTO company) {
        Optional<Company_type> byId = companyTypeRepository.findById(company.getCompany_type());
        if(byId.isEmpty()){
            System.out.println("there is not company type ");
            return null;
        }
        Company c=new Company();
        c.setCompany_type(byId.get());
        c.setCompany_name(company.getCompany_name());
        c.setEmail(company.getEmail());
        c.setCreated_date(LocalDateTime.now());
        c.setPhone_no(company.getPhone_no());
        c.setModified_date(new Date());
        Company save = companyRepo.save(c);

        return new CompanyDTO(save.getCompany_Id(),save.getCompany_name(),save.getEmail(),save.getPhone_no(),save.getCompany_type().getCompany_type_id());
    }

    @Override
    public List<Company> getAll() {
        return  companyRepo.findAll();

    }
}
