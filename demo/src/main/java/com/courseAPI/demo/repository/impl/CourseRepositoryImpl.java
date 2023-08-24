package com.courseAPI.demo.repository.impl;

import com.courseAPI.demo.database.CourseDB;
import com.courseAPI.demo.database.UserDB;
import com.courseAPI.demo.entites.Course;
import com.courseAPI.demo.entites.User;
import com.courseAPI.demo.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public List<Course> getAllCourse() {
        return CourseDB.courseList;
    }

}
