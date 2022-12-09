package com.example.demo.section2.interfaced;

import com.example.demo.section2.classd.Instructor;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
    public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourse, List<String> course);
}
