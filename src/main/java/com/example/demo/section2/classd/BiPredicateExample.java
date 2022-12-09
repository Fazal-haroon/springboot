package com.example.demo.section2.classd;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //BiPredicate
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online == true && experience > 2;

        //Biconsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name : " + name + " courses" + courses);

        instructors.forEach(inst -> {
            if (p3.test(inst.isOnlineCourses(), inst.getYearsOfExpereience())) {
                biConsumer.accept(inst.getName(), inst.getCourses());
            }
        });
    }
}
