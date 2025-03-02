package com.texas.Miniproject.repository;

import com.texas.Miniproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // You can add custom query methods here if needed
}
