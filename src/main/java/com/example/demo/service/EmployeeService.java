package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//Singleton class
@Service
public class EmployeeService {
    List<Employee> employeeList = Arrays.asList(
            new Employee(1, "1st Employee", "Dubai"),
            new Employee(2, "2nd Employee", "International City")
    );

    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    public Employee getEmployee(Integer id){
        return employeeList.stream().filter(x -> (x.getEmployeeId() == id)).findFirst().get();
    }
}
