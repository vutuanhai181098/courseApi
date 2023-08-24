package com.courseAPI.demo.controller;

import com.courseAPI.demo.dto.CourseDto;
import com.courseAPI.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("")
    public ResponseEntity<?> getCourseListByProperties(@RequestParam(required = false) String type,
                                                       @RequestParam(required = false) String name,
                                                       @RequestParam(required = false) String topic
    ) {
        return new ResponseEntity<>(courseService.getCourseByProperties(type, name, topic), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Integer id){
        return new ResponseEntity<>(courseService.getCourseById(id), HttpStatus.OK);
    }
}
