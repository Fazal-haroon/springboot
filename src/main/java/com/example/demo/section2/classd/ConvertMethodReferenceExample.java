package com.example.demo.section2.classd;

import java.util.function.Predicate;

public class ConvertMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> predicate1 = ConvertMethodReferenceExample::greaterThanTwoYearsOfExperience;
        Instructors.getAll().forEach(instructor -> {
            if (predicate1.test(instructor)) {
                System.out.println(instructor);
            }
        });

    }
    public static boolean greaterThanTwoYearsOfExperience(Instructor instructor){
        if (instructor.getYearsOfExpereience() >= 2)
            return true;
        return false;
    }
}
