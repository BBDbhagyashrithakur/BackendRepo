package com.example.ATCProject.DTO;

import com.example.ATCProject.model.College;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
public class CollegeDTO {

    private Long college_Id;
    private String college_name;
    private String email;
    private String phone_no;

    public CollegeDTO(College college) {
    }
}
