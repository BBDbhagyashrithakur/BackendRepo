package com.example.ATCProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@Getter
@Setter
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long job_Id;
    @Column( name ="title",nullable = false)
    private String title;
    @Column( name ="description",nullable = false)
    private String description;
    @Column( name ="job_location",nullable = false)
    private String job_location;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;

    @OneToMany(mappedBy = "jobPost_id")
    private List<Application> applications=new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "placementOfficer_Id")
    private PlacementOfficer placementOfficer;


}
