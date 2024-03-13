package com.example.ATCProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Application_Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long status_Id;
    @Column( name ="status")
    private String status;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
    @OneToMany(mappedBy = "applicationStatus",cascade = CascadeType.ALL)
    private List<Application>applications=new ArrayList<>();


}
