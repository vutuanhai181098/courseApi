package com.courseAPI.demo.mapper;

import com.courseAPI.demo.dto.CourseDto;
import com.courseAPI.demo.dto.UserDto;
import com.courseAPI.demo.entites.Course;
import com.courseAPI.demo.entites.User;
import org.springframework.stereotype.Component;

@Component
public class CourseMapperImpl implements CourseMapper{
    @Override
    public CourseDto convertTo(Course course, UserDto userDto) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setName(course.getName());
        courseDto.setDescription(course.getDescription());
        courseDto.setType(course.getType());
        courseDto.setTopics(course.getTopics());
        courseDto.setThumbnail(course.getThumbnail());
        courseDto.setUserDto(userDto);
        return courseDto;
    }
}
