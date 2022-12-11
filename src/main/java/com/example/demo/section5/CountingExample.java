package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //count the numbers of instructors who teaches online courses
        //stream.count
        long count = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).count();
        System.out.println("count = " + count);

        //collectors.counting
        count = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting());
        System.out.println("count = " + count);
    }
}
