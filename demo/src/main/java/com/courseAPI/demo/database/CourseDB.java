package com.courseAPI.demo.database;

import com.courseAPI.demo.entites.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDB {
    public static List<Course> courseList = new ArrayList<>(List.of(
            new Course("Data Structure - Algorithm - LeetCode", "Description 1", "online", List.of(
                    "Cơ sở dữ liệu"), "https://techmaster.vn/resources/image/thumbnail.jpg", 1),
            new Course("Luyện thi FE", "Description 2", "onlab", List.of(
                    "Lập trình Frontend"), "https://media.techmaster.vn/api/static/36/uhWHezPC", 3),
            new Course("Java cấu trúc dữ liệu - giải thuật", "Description 3", "onlab", List.of("Cơ sở dữ liệu"), "https://media.techmaster.vn/api/static/36/bu7v5ak51co41h2qctt0", 2),
            new Course("Java căn bản", "Description 4", "onlab", List.of("Lập trình Backend"), "https://media.techmaster.vn/api/static/bub3enc51co7s932dsk0/ZuedW7J1", 2),
            new Course("Spring Boot - Web Back End", "Description 5", "onlab", List.of("Lập trình Backend"), "https://media.techmaster.vn/api/static/36/bu7v9ks51co41h2qcttg", 2),
            new Course("Học lập trình Java trực tuyến", "Description 6", "online", List.of("Lập trình Backend"), "https://media.techmaster.vn/api/fileman/Uploads/Java/banner-javabasic.png", 2),
            new Course("Lập trình web với Spring Boot online", "Description 7", "online", List.of("Lập trình Backend"), "https://media.techmaster.vn/api/static/8028/bpfneoc51co8tcg6lek0", 2),
            new Course("Lập trình Web - API - Microservice bằng Golang", "Description 8", "onlab", List.of("Lập trình Backend"), "https://media.techmaster.vn/api/static/36/bu803kc51co41h2qctug", 2),
            new Course("Lập trình Lego Robot Inventor", "Description 9", "onlab", List.of("Lập trình di động"), "https://media.techmaster.vn/api/static/brbgh4451coepbqoch60/eQcu6FM-", 3),
            new Course("Lộ trình DevOps", "Description 10", "onlab", List.of("Lập trình di động"), "https://devops.techmaster.vn/resources/image/banner_devops.png", 1),
            new Course("Nhập môn lập trình - giải thuật cơ bản", "Description 11", "online", List.of("Cơ sở dữ liệu"), "https://media.techmaster.vn/api/fileman/Uploads/users/5463/giaithuat-thumnail.png", 1),
            new Course("Lập trình di động IOS Swift online", "Description 12", "online", List.of("Lập trình di động"), "https://media.techmaster.vn/api/static/8028/bqa348s51cocm3n1ubq0", 3)
    ));
}
