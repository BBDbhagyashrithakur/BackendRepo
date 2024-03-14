package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.CompanyDTO;
import com.example.ATCProject.Entity.Company;
import com.example.ATCProject.Repository.CompanyRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyServiceImpl {
    @Autowired
    private CompanyRepo companyRepository;
@Autowired
private ModelMapper modelMapper;

    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        Company company =Company.builder()
                .company_name(companyDTO.getCompanyName())
                .email(companyDTO.getEmail())
                .phone_no(companyDTO.getCompanyName())
                .build();
        companyRepository.save(company);
        return companyDTO;
    }


    public List<CompanyDTO> getAllCompanies() {
        List<Company> companies = companyRepository.findAll();
        List<CompanyDTO> companyDTOs = new ArrayList<>();
        for (Company company : companies) {
            companyDTOs.add(modelMapper.map(company,CompanyDTO.class));
        }
        return companyDTOs;
    }


    public CompanyDTO getCompanyById(int companyId) {
        Company company = companyRepository.findById(companyId).orElse(null);
        if (company != null) {
            return modelMapper.map(company,CompanyDTO.class);
        }
        return null;
    }


    public CompanyDTO updateCompany(int companyId, CompanyDTO companyDTO) {
        Company existingCompany = companyRepository.findById(companyId).orElse(null);
        if (existingCompany != null) {
            existingCompany.setCompany_name(companyDTO.getCompanyName());
            existingCompany.setEmail(companyDTO.getEmail());
            existingCompany.setPhone_no(companyDTO.getPhoneNumber());

            existingCompany = companyRepository.save(existingCompany);

            return modelMapper.map(existingCompany,CompanyDTO.class);
        }
        return null;
    }


    public String deleteCompany(int companyId) {
        companyRepository.deleteById(companyId);
        return "Company is deleted";
    }

}
