package com.example.ATCProject.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_Id;
    @Column( name ="company_name",nullable = false)
    private String company_name;
    @Column( name ="email",nullable = false)
    private String email;
    @Column( name ="phone_no")
    private String phone_no;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<JobPost> jobPost=new ArrayList<>();
    @ManyToOne
    @JsonIgnore
    private Company_type company_type;
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<JobPost> jobPosts=new ArrayList<>();

}
