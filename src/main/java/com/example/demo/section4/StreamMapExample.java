package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        //return only instructor names from the instructor list
        List<String> instructorNames = Instructors.getAll().stream().map(Instructor::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("instructorNames = " + instructorNames);
    }
}
