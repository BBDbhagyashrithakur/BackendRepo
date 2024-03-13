package com.example.ATCProject.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class JobPostDTO {
    private String title;

    private String description;

    private String job_location;

    private Long company_id;
}
