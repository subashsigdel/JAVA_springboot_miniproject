package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Course;
import com.texas.Miniproject.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> save(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Course>> list() {
        return new ResponseEntity<>(courseService.listAllCourses(), HttpStatus.OK);
    }
}
