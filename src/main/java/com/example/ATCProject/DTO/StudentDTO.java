package com.example.ATCProject.DTO;

import com.example.ATCProject.model.College;
import com.example.ATCProject.model.User_data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {

    private Long student_Id;

    private String resume;


    private Long userId;


    private Long collegeId;
}
