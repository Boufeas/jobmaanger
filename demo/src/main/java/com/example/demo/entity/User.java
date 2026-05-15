package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")

public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Integer id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    List<Job> jobs;

}
