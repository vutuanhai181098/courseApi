package com.courseAPI.demo.mapper;

import com.courseAPI.demo.dto.UserDto;
import com.courseAPI.demo.entites.User;

public interface UserMapper {
    UserDto convertTo(User user);
}
