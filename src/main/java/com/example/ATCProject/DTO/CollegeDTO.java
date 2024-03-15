package com.example.ATCProject.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CollegeDTO {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
}
