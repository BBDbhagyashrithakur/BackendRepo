package com.example.ATCProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
public class Application_Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long status_Id;
    @Column( name ="status")
    private String status;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
}
