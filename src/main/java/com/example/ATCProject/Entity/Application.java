package com.example.ATCProject.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
    @Entity
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class Application {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn(name = "userId")
        private Users user;
        private String status;
        @ManyToOne
        @JoinColumn(name="job_Id")
        @JsonIgnore
        private JobPost jobPost;
    }

