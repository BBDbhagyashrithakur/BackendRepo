package com.example.ATCProject.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String mobilenumber;
    private String role;
    private int collegeId;
}
