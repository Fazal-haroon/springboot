package com.example.demo.section2.classd;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    //method reference is a shorthand notation of a lambda experession to call a method
    //they can only be used to replace a single-method lambda expression
    //* Lambda expression: str -> System.out.println(str)
    //* Method Reference: System.out::println
    //There are 3 types of method reference in java
    //1. Class::staticMethod {reference to a static method}
    //2. object::instanceMethod {reference to an instance method}
    //3. Class::new {reference to a constructor}
    //(a) -> System.out.println(a * 10);
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        Function<Integer, Double> sqrt2 = Math::sqrt;

        Function<String, String> lowerCaseFunction = s -> s.toLowerCase();
        Function<String, String> lowerCaseFunction2 = String::toLowerCase;

        Predicate<Instructor> p1 = (instructor -> instructor.isOnlineCourses());
        Predicate<Instructor> p2 = Instructor::isOnlineCourses;
    }
}
