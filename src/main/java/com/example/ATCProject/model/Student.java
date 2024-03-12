package com.example.ATCProject.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;

import static java.time.LocalDateTime.now;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_Id;
    @Column( name ="resume",nullable = false)
    private String resume;

    @OneToOne
    private User_data User_Id;

    @ManyToOne
    @JoinColumn(name = "department_id")
    @JsonIgnore
    private Department department_id;

    @ManyToOne
    @JoinColumn(name = "college_id")
    @JsonIgnore
    private College college;
}