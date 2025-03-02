package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Course;
import java.util.Optional;
import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    List<Course> listAllCourses();

    Optional<Course> getCourseById(Long id);

    void deleteCourse(Long id);

    Course updateCourse(Course course);
}
