package com.example.ATCProject.model;
import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.time.LocalDateTime.now;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="company_type")
public class Company_type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_type_id;
    @Column( name ="type",nullable = false)
    private String type;
    @OneToMany(mappedBy = "company_type")
    private List<Company>companies=new ArrayList<>();
}