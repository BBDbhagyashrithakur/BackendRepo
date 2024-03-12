package com.example.ATCProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Institute_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long institute_Id;
    @Column( name ="institute_type")
    private String institute_type;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @OneToMany(mappedBy ="institute_type")
    private List <College> colleges=new ArrayList<>();
}
