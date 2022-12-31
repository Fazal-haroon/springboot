package com.example.learnjpaandhibernate.jpa;

import com.example.learnjpaandhibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1L, "Abdul Hanan", "fazal");
        Course course2 = new Course(2L, "Abdul Manan", "fazal");
        Course course3 = new Course(3L, "Muhammad", "fazal2");
        Course course4 = new Course(4L, "Muhammad", "fazal");
        courseSpringDataJpaRepository.save(course);
        courseSpringDataJpaRepository.save(course2);
        courseSpringDataJpaRepository.save(course3);
        courseSpringDataJpaRepository.save(course4);
        System.out.println(courseSpringDataJpaRepository.findById(1L));
        System.out.println(courseSpringDataJpaRepository.findById(2L));
        System.out.println(courseSpringDataJpaRepository.findByAuthor("fazal"));
        System.out.println(courseSpringDataJpaRepository.findByName("Muhammad"));
        courseSpringDataJpaRepository.deleteById(2L);
    }
}
