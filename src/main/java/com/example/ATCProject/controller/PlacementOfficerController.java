package com.example.ATCProject.controller;

import com.example.ATCProject.DTO.PlacementOfficerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collage")
public class PlacementOfficerController {
    @PostMapping("/addtpo/{collageId}")
    public PlacementOfficerDTO addplacementofficer(@RequestBody PlacementOfficerDTO placementOfficerDTO){
        return  new PlacementOfficerDTO();
    }
}
