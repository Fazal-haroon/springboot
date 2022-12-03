package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Singleton class
@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "1st Employee", "Dubai"),
            new Employee(2, "2nd Employee", "International City")
    ));

    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    public Employee getEmployee(Integer id){
        return employeeList.stream().filter(x -> (x.getEmployeeId() == id)).findFirst().get();
    }

    public void createEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void updateEmployee(Integer id,Employee employee){
        List<Employee> tempEmployee = new ArrayList<>();
        for (Employee employee1 : employeeList){
            if(employee1.getEmployeeId() == id){
                employee1.setEmployeeName(employee.getEmployeeName());
                employee1.setEmployeeCity(employee.getEmployeeCity());
            }
            tempEmployee.add(employee1);
        }
        this.employeeList = tempEmployee;
    }

    public void deleteEmployee(Integer id){
        List<Employee> temp = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getEmployeeId() == id)
                continue;
            temp.add(employee);
        }
        this.employeeList = temp;
    }
}
