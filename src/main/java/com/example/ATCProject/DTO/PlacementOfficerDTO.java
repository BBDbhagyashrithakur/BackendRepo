package com.example.ATCProject.DTO;

import com.example.ATCProject.model.JobPost;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlacementOfficerDTO {
    private Long placementOfficer_Id;
    private Long User_Id;
    private  Long college_Id;

}
