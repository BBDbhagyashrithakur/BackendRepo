package com.example.ATCProject.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String mobilenumber;
    private String role;
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;


}
