package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
public class EmployeeController {

    //Business service layers are singleton(single instance)
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = "/employee")
    public Employee getEmployeeById(@RequestParam(value = "id", required = true) Integer id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping(value = "/employee")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @PutMapping(value = "/employee")
    public void updateEmployee(@RequestParam Integer id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping(value = "/employee/{id}")
    public List<Employee> deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return employeeService.getAllEmployee();
    }
}
