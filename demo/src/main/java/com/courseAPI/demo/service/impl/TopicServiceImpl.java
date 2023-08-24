package com.courseAPI.demo.service.impl;

import com.courseAPI.demo.repository.TopicRepository;
import com.courseAPI.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;
    @Override
    public List<String> getAllTopic() {
        return topicRepository.getAllTopic();
    }
}
