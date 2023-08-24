package com.courseAPI.demo.repository.impl;

import com.courseAPI.demo.database.UserDB;
import com.courseAPI.demo.entites.User;
import com.courseAPI.demo.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> getAllUser() {
        return UserDB.userList;
    }
}
