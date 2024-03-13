package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.CompanyDTO;
import com.example.ATCProject.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @PostMapping("/add")
    public ResponseEntity<CompanyDTO>addCompanyType(@RequestBody CompanyDTO companyDTO)
    {
        CompanyDTO companyDTO1 = companyService.AddCompany(companyDTO);
        return new  ResponseEntity<>(companyDTO1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO>addCompanyType(@PathVariable Long id)
    {
        return new  ResponseEntity<>(new CompanyDTO(), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public  ResponseEntity<List<Company>>GetAll()
    {
        List<Company> all = companyService.getAll();
        return   new ResponseEntity<>(all,HttpStatus.CREATED);
    }
}
