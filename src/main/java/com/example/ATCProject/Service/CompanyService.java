package com.example.ATCProject.Service;

import com.example.ATCProject.DTO.CompanyDTO;
import com.example.ATCProject.model.Company;
import com.example.ATCProject.model.Company_type;

import java.util.List;

public interface CompanyService {
    CompanyDTO AddCompany(CompanyDTO company);

    List<Company> getAll();
}
