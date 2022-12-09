package com.example.demo.section2.classd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalExample2 {
    public static void main(String[] args) {
        //Map of instructors with name and years of experience
        //Function which will List<Instructors> and return a Map<String, Integer>
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructorOnline -> {
            Map<String, Integer> map = new HashMap<>();
            instructorOnline.forEach(instructor -> map.put(instructor.getName(), instructor.getYearsOfExpereience()));
            return map;
        });
        System.out.println(mapFunction.apply(Instructors.getAll()));
        //Predicate will return true if instructor has online courses
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;
        Function<List<Instructor>, Map<String, Integer>> mapFunction1 = (instructorOnline -> {
            Map<String, Integer> map = new HashMap<>();
            instructorOnline.forEach(instructor -> {
                if (p1.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExpereience());
                }
            });
            return map;
        });
        System.out.println(mapFunction1.apply(Instructors.getAll()));
    }
}
