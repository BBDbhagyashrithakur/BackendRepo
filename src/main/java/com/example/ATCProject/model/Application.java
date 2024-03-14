package com.example.ATCProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long application_Id;
    @Column( name ="date_applied",nullable = false)
    private Date date_applied;

    public Application() {
    }

    @ManyToOne
    @JoinColumn(name="jobPost_id")
    @JsonIgnore
    private JobPost jobPost_id;
    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student student;

}
