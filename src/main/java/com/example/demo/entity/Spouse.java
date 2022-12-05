package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "spouse")
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mobileNo;
    private Long age;

//    @JsonBackReference
    @JsonIgnore
    @OneToOne(mappedBy = "spouse")
    private Employee employee;

    public Spouse(String name, String mobileNo, Long age, Employee employee) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
        this.employee = employee;
    }

    public Spouse(String name, String mobileNo, Long age) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }
}
