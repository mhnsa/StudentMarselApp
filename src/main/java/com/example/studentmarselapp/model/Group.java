package com.example.studentmarselapp.model;

import javax.persistence.*;


@Entity
@Table(name = "university_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;
}
