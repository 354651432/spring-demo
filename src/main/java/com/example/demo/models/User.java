package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(name = "id")
    public Long id;

    @Column(name = "username")
    public String username;

    @Column(name = "realname")
    public String realname;
}
