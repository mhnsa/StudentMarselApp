package com.example.studentmarselapp.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, unique = true )
    private String name;

    @Column(name = "surname", nullable = false, unique = true )
    private String surname;
}
