package com.texas.Miniproject.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "course")
public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence",sequenceName = "course_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_sequence")

    private Long id;
    private String courseName;
    private String description;
    private Integer credit;

    @ManyToOne
    private Department department_id;



}
