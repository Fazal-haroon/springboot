package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        //Get a list of all the courses which instructors offers
        List<String> instructorCourses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(instructorCourses);
    }
}
