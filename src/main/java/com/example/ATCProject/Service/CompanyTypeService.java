package com.example.ATCProject.Service;

import com.example.ATCProject.model.Company_type;

import java.util.List;

public interface CompanyTypeService {
    Company_type AddCompanyType(Company_type company_type);

    List<Company_type> getAll();
}
