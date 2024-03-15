package com.example.ATCProject.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@Builder
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String mobilenumber;
    private String role;
    private int collegeId;
}
