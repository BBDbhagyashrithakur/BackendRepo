package com.example.ATCProject.model;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

import static java.time.LocalDateTime.now;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User_data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_Id;
    @Column( name ="first_name",nullable = false)
    private String first_name;
    @Column( name ="last_name",nullable = false)
    private String last_name;
    @Column( name ="user_email",nullable = false)
    private String user_email;
    @Column( name ="mobile_number")
    private String mobile_number;
    @Column( name ="created_date")
    private LocalDateTime created_date;
    @Column( name ="modified_date")
    private Date modified_date;
//    @OneToOne(mappedBy = "User_Id")
//    private student stud;
//    @OneToOne(mappedBy = "User_Id")
//    private placementOfficer placementOfficer;

}
