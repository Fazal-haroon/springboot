package com.example.demo.controller;

import com.example.demo.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    List<Employee> employeeList = Arrays.asList(
            new Employee(1, "1st Employee", "Dubai"),
            new Employee(2, "2nd Employee", "International City")
    );

    @RequestMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeList;
    }
}
