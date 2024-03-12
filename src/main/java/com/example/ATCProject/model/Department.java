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
public class Department {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_Id;
    @Column( name ="name")
    private String name;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @OneToMany(mappedBy = "department_id",cascade =CascadeType.ALL)
    private List<Student>students=new ArrayList<>();
}
