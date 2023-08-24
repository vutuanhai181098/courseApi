package com.courseAPI.demo.repository.impl;

import com.courseAPI.demo.database.TopicDB;
import com.courseAPI.demo.repository.TopicRepository;
import com.courseAPI.demo.service.TopicService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicRepositoryImpl implements TopicRepository {
    @Override
    public List<String> getAllTopic() {
        return TopicDB.topicList;
    }
}
