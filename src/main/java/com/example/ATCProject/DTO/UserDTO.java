package com.example.ATCProject.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDTO {
    private String name;
    private String email;
    private String mobilenumber;
    private String role;
    private int collegeId;
}
