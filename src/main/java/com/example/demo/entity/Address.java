package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String line1;
    private String line2;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    @JsonIgnore
//    @JsonBackReference
    @ManyToOne
    private Employee employee;

    public Address(String line1, String line2, String zipCode, String city, String state, String country, Employee employee) {
        this.line1 = line1;
        this.line2 = line2;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.employee = employee;
    }

    public Address(String line1, String line2, String zipCode, String city, String state, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
