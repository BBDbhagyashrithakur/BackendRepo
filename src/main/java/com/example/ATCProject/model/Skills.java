package com.example.ATCProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skill_Id;
    @Column( name ="skill_name")
    private String institute_type;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
}
