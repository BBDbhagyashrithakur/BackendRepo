package com.example.ATCProject.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int job_Id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "job_location", nullable = false)
    private String job_location;


    @OneToMany(mappedBy = "jobPost",cascade = CascadeType.ALL)
    //@OneToMany(mappedBy = "jobPost", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Application> applications=new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "company_Id")
    private Company company;
}
