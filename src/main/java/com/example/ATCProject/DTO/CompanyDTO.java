package com.example.ATCProject.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private Long company_Id;

    private String company_name;

    private String email;
    private String phone_no;
    private  Long company_type;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserDTO {
        private Long user_Id;
        private  String first_name;
        private  String last_name;
        private  String user_email;
        private  String mobile_number;


    }
}
