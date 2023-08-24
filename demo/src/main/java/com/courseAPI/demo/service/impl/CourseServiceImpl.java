package com.courseAPI.demo.service.impl;

import com.courseAPI.demo.dto.CourseDto;
import com.courseAPI.demo.dto.UserDto;
import com.courseAPI.demo.entites.Course;
import com.courseAPI.demo.entites.User;
import com.courseAPI.demo.exception.ResourceNotFoundException;
import com.courseAPI.demo.mapper.CourseMapper;
import com.courseAPI.demo.mapper.UserMapper;
import com.courseAPI.demo.repository.CourseRepository;
import com.courseAPI.demo.repository.UserRepository;
import com.courseAPI.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<CourseDto> getCourseByProperties(String type, String name, String topic) {
        List<Course> courseList = courseRepository.getAllCourse().stream()
                .filter(c -> (type == null || c.getType().toLowerCase().contains(type.toLowerCase())) &&
                        (name == null || c.getName().toLowerCase().contains(name.toLowerCase())) &&
                        (topic == null || c.getTopics().contains(topic))).collect(Collectors.toList());
        List<User> userList = userRepository.getAllUser();
        List<CourseDto> courseDtoList = new ArrayList<>();
        for (Course course: courseList
             ) {
            User user = userList.stream().filter(u -> u.getId().equals(course.getUserId())).findFirst().orElse(null);
            CourseDto courseDto = courseMapper.convertTo(course, userMapper.convertTo(user));
            courseDtoList.add(courseDto);
        }
        return courseDtoList;
    }

    @Override
    public CourseDto getCourseById(Integer id) {
        Course course = courseRepository.getAllCourse().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElseThrow(() -> {
                    throw new ResourceNotFoundException("Not found course");
                });
        User user = userRepository.getAllUser().stream()
                .filter(u -> u.getId().equals(course.getUserId())).findFirst().orElse(null);
        return courseMapper.convertTo(course, userMapper.convertTo(user));
    }
}
