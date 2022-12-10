package com.example.demo.section4;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main(String[] args) {
        //count
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .count();
        System.out.println("count = " + count);

        //count and distinct
        Long countDistinct = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("countDistinct = " + countDistinct);

        //distinct courses name
        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("courses = " + courses);

        //anyMatch allMatch noneMatch
        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(s -> s.startsWith("J"));
        System.out.println("match = " + match);

        boolean match1 = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .allMatch(s -> s.startsWith("m"));
        System.out.println("match = " + match1);

        boolean match2 = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s -> s.startsWith("r"));
        System.out.println("match = " + match2);

        //returning all instructors sorted by their name
        List<Instructor> list = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
        list.forEach(System.out::println);

        //returning instructors sorted by their name and have more that 2 years of experience
        List<Instructor> list1 = Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExpereience() > 2)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        list1.forEach(System.out::println);
    }
}
