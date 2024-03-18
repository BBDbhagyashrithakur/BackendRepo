package com.example.ATCProject.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "email",nullable = false,unique = true)
    private String email;
    private String phoneNumber;
    @OneToMany(mappedBy = "college")
    private List<Users> users;
}
