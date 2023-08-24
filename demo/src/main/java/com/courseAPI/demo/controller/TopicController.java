package com.courseAPI.demo.controller;

import com.courseAPI.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;
    @GetMapping("")
    public ResponseEntity<?> getAllTopic(){
        return new ResponseEntity<>(topicService.getAllTopic(), HttpStatus.OK);
    }
}
