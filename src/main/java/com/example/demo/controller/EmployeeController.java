package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.validation.Valid;

@RestController
public class EmployeeController {

    //Business service layers are singleton(single instance)
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employee")
    public Employee getEmployeeById(@RequestParam(value = "id", required = true) Integer id){
        return employeeService.getEmployee(id);
    }
}
