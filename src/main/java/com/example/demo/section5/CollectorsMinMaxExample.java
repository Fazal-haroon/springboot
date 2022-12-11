package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        Optional<Instructor> instructor = Instructors.getAll().stream().collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExpereience)));
        System.out.println("instructor.get() = " + instructor.get());
        System.out.println("--------------------------------------");

        instructor = Instructors.getAll().stream().min(Comparator.comparing(Instructor::getYearsOfExpereience));
        System.out.println("instructor = " + instructor.get());
        System.out.println("--------------------------------------");

        instructor = Instructors.getAll().stream().collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExpereience)));
        System.out.println("instructor.get() = " + instructor.get());
        System.out.println("--------------------------------------");

        instructor = Instructors.getAll().stream().max(Comparator.comparing(Instructor::getYearsOfExpereience));
        System.out.println("instructor = " + instructor.get());
        System.out.println("--------------------------------------");
    }
}
