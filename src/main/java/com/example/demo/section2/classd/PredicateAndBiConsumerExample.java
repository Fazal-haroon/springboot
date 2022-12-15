package com.example.demo.section2.classd;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //all instructor who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

        //instructor experience is > 2
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExpereience() > 2;

        //Biconsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name : " + name + " courses" + courses);

        instructors.forEach(inst -> {
            if (p1.and(p2).test(inst)) {
                biConsumer.accept(inst.getName(), inst.getCourses());
            }
        });


    }
}
