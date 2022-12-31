//package com.example.learnjpaandhibernate.jpa;
//
//import com.example.learnjpaandhibernate.entity.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CourseCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    private CourseJpaRepository courseJpaRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Course course = new Course(1L, "Abdul Hanan", "Data Scientist");
//        Course course2 = new Course(2L, "Abdul Manan", "Manager");
//        courseJpaRepository.insert(course);
//        courseJpaRepository.insert(course2);
//        System.out.println(courseJpaRepository.findById(1L));
//        System.out.println(courseJpaRepository.findById(2L));
//        courseJpaRepository.deleteById(2L);
//    }
//}
