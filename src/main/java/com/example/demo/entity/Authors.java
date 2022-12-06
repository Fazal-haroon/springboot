package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;
    @Column(name = "description", length = 250, nullable = false)
    private String description;

    @ManyToMany(mappedBy = "authors", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Books> books = new HashSet<>();
}
