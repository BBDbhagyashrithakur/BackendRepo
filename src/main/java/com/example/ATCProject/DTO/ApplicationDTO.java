package com.example.ATCProject.DTO;

import com.example.ATCProject.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationDTO {
    private Long application_Id;
    private Long student_Id;
    private Long status_Id;
    //private String resume;
    private Long user_Id;
    private Long job_Id;
    private Long department_Id;
    private Long placementOfficer_Id;
}
