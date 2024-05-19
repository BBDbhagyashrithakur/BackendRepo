package org.example.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Job {
    public enum JobType {
        Internship,
        Full_Time,
        Part_Time,
        Contract
    }
    public enum SalaryRange {
        Low,
        Medium,
        High
    }

    public enum ExperienceLevel {
        Entry_Level,
        Mid_Level,
        Senior_Level
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private JobCategory category;

    private String companyName;

    private String location;

    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @Enumerated(EnumType.STRING)
    private SalaryRange salaryRange;

    @Enumerated(EnumType.STRING)
    private ExperienceLevel experienceLevel;

    private String requiredSkills;

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", companyName='" + companyName + '\'' +
                ", address=" + location +
                ", jobType=" + jobType +
                ", salaryRange=" + salaryRange +
                ", experienceLevel=" + experienceLevel +
                ", requiredSkills='" + requiredSkills + '\'' +
                ", visitLink='" + visitLink + '\'' +
                '}';
    }

    private String visitLink;
}
