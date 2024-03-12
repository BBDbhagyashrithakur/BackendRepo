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
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long application_Id;
    @Column( name ="date_applied",nullable = false)
    private String date_applied;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @ManyToOne
    @JsonIgnore
    private JobPost jobPost_id;
    @OneToMany
    private List<Student>students=new ArrayList<>();
}
