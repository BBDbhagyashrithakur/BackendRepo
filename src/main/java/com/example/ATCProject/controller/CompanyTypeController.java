package com.example.ATCProject.controller;

import com.example.ATCProject.Service.CompanyTypeService;
import com.example.ATCProject.model.Company_type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/companyType")
public class CompanyTypeController {
    @Autowired
    private   CompanyTypeService companyTypeService;
    @PostMapping("/add")
    public ResponseEntity<Company_type>addCompanyType(@RequestBody Company_type company_type)
    {
        return new  ResponseEntity<>(companyTypeService.AddCompanyType(company_type),HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Company_type>>getAll()
    {
        return  new ResponseEntity<>(new ArrayList<>(), HttpStatusCode.valueOf(200));
    }

}
