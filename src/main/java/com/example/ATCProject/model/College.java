package com.example.ATCProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long college_Id;
    @Column( name ="college_name",nullable = false)
    private String college_name;
    @Column( name ="email",nullable = false)
    private String email;
    @Column( name ="phone_no",nullable = false)
    private String phone_no;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @ManyToOne
    @JsonIgnore
    private Institute_Type institute_type;

    @OneToMany
    private List<Student>students=new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private PlacementOfficer placementOfficer;
}
