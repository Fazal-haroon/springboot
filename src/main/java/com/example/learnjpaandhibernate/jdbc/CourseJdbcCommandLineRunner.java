package com.example.learnjpaandhibernate.jdbc;

import com.example.learnjpaandhibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(4L, "Abdul Hanan", "Data Scientist");
        Course course2 = new Course(5L, "Abdul Manan", "Manager");
        courseJdbcRepository.insert(course);
        courseJdbcRepository.insert(course2);

        courseJdbcRepository.deleteById(3L);

        System.out.println(courseJdbcRepository.findById(1L));
        System.out.println(courseJdbcRepository.findById(2L));
    }
}
