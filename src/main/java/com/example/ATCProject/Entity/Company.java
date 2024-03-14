package com.example.ATCProject.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int company_Id;
    @Column( name ="company_name",nullable = false)
    private String company_name;
    @Column( name ="email",nullable = false)
    private String email;
    @Column( name ="phone_no")
    private String phone_no;
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<JobPost> jobpost=new ArrayList<>();

}
