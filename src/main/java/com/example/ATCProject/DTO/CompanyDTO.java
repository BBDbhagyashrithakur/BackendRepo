package com.example.ATCProject.DTO;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
    public class CompanyDTO {
        private String companyName;
        private String email;
        private String phoneNumber;
    }


