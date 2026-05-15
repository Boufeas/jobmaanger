package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categories")

public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Integer id;
    private String name;

    @OneToMany(mappedBy = "category")
    List<Job> jobs;
}
