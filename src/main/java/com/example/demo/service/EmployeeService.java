package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
//        return employeeList;
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Integer id){
//        return employeeList.stream().filter(x -> (x.getEmployeeId() == id)).findFirst().get();
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public void createEmployee(Employee employee){
//        employeeList.add(employee);
        employeeRepository.save(employee);
    }

    public void updateEmployee(Integer id,Employee employee){
        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        updateEmployee.setEmployeeName(employee.getEmployeeName());
        updateEmployee.setEmployeeCity(employee.getEmployeeCity());
        employeeRepository.save(updateEmployee);
    }

    public void deleteEmployee(Integer id){
//        List<Employee> temp = new ArrayList<>();
//        for (Employee employee : employeeList){
//            if (employee.getEmployeeId() == id)
//                continue;
//            temp.add(employee);
//        }
//        this.employeeList = temp;
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        employeeRepository.delete(employee);
    }
}
