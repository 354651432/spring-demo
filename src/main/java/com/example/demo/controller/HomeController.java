package com.example.demo.controller;

import com.example.demo.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private HibernateTemplate ht;

    @GetMapping("/")
    public User Home() {
        return this.ht.get(User.class, 344);
    }
}
