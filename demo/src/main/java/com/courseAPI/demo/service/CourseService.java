package com.courseAPI.demo.service;

import com.courseAPI.demo.dto.CourseDto;
import com.courseAPI.demo.entites.Course;

import java.util.List;

public interface CourseService {
    List<CourseDto> getCourseByProperties(String type, String name, String topic);

    CourseDto getCourseById(Integer id);
}
