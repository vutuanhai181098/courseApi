package com.courseAPI.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private static AtomicInteger autoId = new AtomicInteger(0);
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String avatar;

    public User(String name, String email, String phone, String avatar){
        this.id = autoId.incrementAndGet();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
    }
}
