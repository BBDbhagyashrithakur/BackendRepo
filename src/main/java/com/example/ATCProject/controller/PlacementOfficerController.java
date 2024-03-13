package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.PlacementOfficerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placementofficer")
public class PlacementOfficerController {
    @PostMapping("/add")
    public PlacementOfficerDTO addplacementofficer(@RequestBody PlacementOfficerDTO placementOfficerDTO){
        return  new PlacementOfficerDTO();
    }
}
