package com.example.ATCProject.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
