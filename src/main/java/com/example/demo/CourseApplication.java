package com.example.demo;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Project;
import com.example.demo.entity.Spouse;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner initialCreate(EmployeeService employeeService) {
//        return (args) -> {
//            Address address = new Address("Line 1", "Line 2", "ZipCode1", "City1", "State1", "Country1");
//            Project project = new Project("Name1", "Client Name1");
//            Spouse spouse = new Spouse("Name1", "Mobile1", 24L);
//
//            Employee employee = new Employee("Employee1", "City1");
//            employee.addProject(project);
//            employee.addAddress(address);
//            employee.setSpouse(spouse);
//            employeeService.createEmployee(employee);
//
//            System.out.println("Getting an employee");
//            Employee employee1 = employeeService.getEmployee(1);
//        };
//    }
}
