package com.courseAPI.demo.repository;

import com.courseAPI.demo.database.CourseDB;
import com.courseAPI.demo.entites.Course;
import com.courseAPI.demo.entites.User;

import java.util.List;

public interface CourseRepository {

    List<Course> getAllCourse();
}
