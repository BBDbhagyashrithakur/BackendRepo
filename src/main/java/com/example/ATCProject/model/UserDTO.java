package com.example.ATCProject.model;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long user_Id;
    private  String first_name;
    private  String last_name;
    private  String user_email;
    private  String mobile_number;


}
