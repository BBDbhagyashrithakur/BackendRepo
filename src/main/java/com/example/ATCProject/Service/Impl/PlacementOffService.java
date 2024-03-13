package com.example.ATCProject.Service.Impl;

import com.example.ATCProject.DTO.PlacementOfficerDTO;
import com.example.ATCProject.Repository.CollageRepo;
import com.example.ATCProject.Repository.PlacementOfficerRepo;
import com.example.ATCProject.Repository.UserRepository;
import com.example.ATCProject.model.College;
import com.example.ATCProject.model.PlacementOfficer;
import com.example.ATCProject.model.User_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlacementOffService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CollageRepo collageRepo;

    @Autowired
    private PlacementOfficerRepo placementOfficerRepo;
    public PlacementOfficerDTO createTPO(PlacementOfficerDTO placementOfficerDTO){
        Optional<User_data> byId = userRepository.findById(placementOfficerDTO.getUser_Id());
        Optional<College> byId1 = collageRepo.findById(placementOfficerDTO.getCollege_Id());
        if (byId .isEmpty() || byId1.isEmpty()){
            return null;
        }
        PlacementOfficer p=new PlacementOfficer();
        p.setCollege(byId1.get());
        p.setUser_Id(byId.get());
        PlacementOfficer save = placementOfficerRepo.save(p);
        return new PlacementOfficerDTO(save.getPlacementOfficer_Id(),save.getUser_Id().getUser_Id(),save.getCollege().getCollege_Id());


    }
}
