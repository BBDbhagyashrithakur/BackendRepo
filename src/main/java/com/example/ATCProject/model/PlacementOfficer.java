package com.example.ATCProject.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class PlacementOfficer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placementOfficer_Id;
    @OneToOne
    private User_data User_Id;

    @OneToMany
    private List<College>colleges=new ArrayList<>();
    @OneToMany(mappedBy = "placementOfficer_Id",cascade = CascadeType.ALL)
    private List<JobPost>jobPosts=new ArrayList<>();

}
