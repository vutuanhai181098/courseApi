package com.courseAPI.demo.mapper;

import com.courseAPI.demo.dto.CourseDto;
import com.courseAPI.demo.dto.UserDto;
import com.courseAPI.demo.entites.Course;
import com.courseAPI.demo.entites.User;

public interface CourseMapper {
    CourseDto convertTo(Course course, UserDto userDto);
}
