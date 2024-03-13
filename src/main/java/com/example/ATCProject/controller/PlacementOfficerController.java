package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.PlacementOfficerDTO;
import com.example.ATCProject.Service.Impl.PlacementOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placementofficer")
public class PlacementOfficerController {
    @Autowired
    private PlacementOffService placementOffService;
    @PostMapping("/add")
    public PlacementOfficerDTO add(@RequestBody PlacementOfficerDTO placementOfficerDTO){

        return  placementOffService.createTPO(placementOfficerDTO);
    }
}
