package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Course;
import com.texas.Miniproject.repository.CourseRepository;  // Assuming you have a CourseRepository for DB access
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class Courseimpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public Courseimpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> listAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
