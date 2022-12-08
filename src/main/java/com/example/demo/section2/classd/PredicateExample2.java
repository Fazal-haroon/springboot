package com.example.demo.section2.classd;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        //all instructor who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

        //instructor experience is > 2 years
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExpereience() > 2;

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(inst -> {
            if (p1.test(inst)){
                System.out.println(instructors);
            }
        });

        System.out.println("----------------------------");

        //is instructor teaches online and experience is > 2 years
        instructors.forEach(inst -> {
            if(p1.and(p2).test(inst)){
                System.out.println(inst);
            }
        });
    }
}
