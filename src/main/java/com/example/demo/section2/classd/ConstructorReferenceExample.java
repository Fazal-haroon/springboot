package com.example.demo.section2.classd;

import com.example.demo.section2.interfaced.InstructorFactory;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike", 10, "software developer", "M", true, Arrays.asList("JavaP", "CP", "C"));
        System.out.println(instructor);
    }
}
