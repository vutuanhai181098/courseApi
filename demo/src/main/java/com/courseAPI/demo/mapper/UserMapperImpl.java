package com.courseAPI.demo.mapper;

import com.courseAPI.demo.dto.UserDto;
import com.courseAPI.demo.entites.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper{
    @Override
    public UserDto convertTo(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setAvatar(user.getAvatar());
        return userDto;
    }
}
