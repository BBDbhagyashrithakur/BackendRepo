package com.example.ATCProject.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PlacementOfficer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placementOfficer_Id;
    @OneToOne
    private User_data User_Id;

    @ManyToOne
    @JoinColumn(name = "college_Id")
    @JsonIgnore
    private College college;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "jobPost_id")
    private JobPost jobPost;
    @OneToMany
    private List<JobPost> jobPosts=new ArrayList<>();

}