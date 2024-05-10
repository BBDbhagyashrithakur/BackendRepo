package com.example.ATCProject.DTO;

import com.example.ATCProject.Entity.Users;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class ApplicationDTO {
        private Users user;
        private String status;

}
