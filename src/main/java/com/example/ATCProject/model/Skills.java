package com.example.ATCProject.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skill_Id;
    @Column( name ="skill_name")
    private String skill_name;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @OneToMany(mappedBy = "skills",cascade = CascadeType.ALL)
    private List<JobPost> jobPosts=new ArrayList<>();
}
