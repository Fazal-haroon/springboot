package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String clientName;

    @JsonIgnore
//    @JsonBackReference
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public Project(String name, String clientName, List<Employee> employees) {
        this.name = name;
        this.clientName = clientName;
        this.employees = employees;
    }

    public Project(String name, String clientName) {
        this.name = name;
        this.clientName = clientName;
    }
}
