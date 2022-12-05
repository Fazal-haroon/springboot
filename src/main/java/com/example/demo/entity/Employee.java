package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer employeeId;
    private String employeeName;
    private String employeeCity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_spouse")
    private Spouse spouse;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name = "fk_employee"),
            inverseJoinColumns = @JoinColumn(name = "fk_project"))
    private List<Project> projects;

    public Employee(String employeeName, String employeeCity, Spouse spouse, List<Address> addresses, List<Project> projects) {
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
        this.spouse = spouse;
        this.addresses = addresses;
        this.projects = projects;
    }

    public void removeProject(Project project){
        this.projects.remove(project);
        project.getEmployees().remove(project);
    }

    public void addProject(Project project){
        this.projects.add(project);
        project.getEmployees().add(this);
    }
}
