package com.example.demo.section2.classd;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of 64: "+ sqrt.apply(64));
        System.out.println("Square root of 64: "+ sqrt.apply(81));

        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        System.out.println(lowerCaseFunction.apply("PROGRAMMING"));
        Function<String, String> concatFunction = (s) -> {
            return s.concat(" In Java + "+s);
        };
        System.out.println(lowerCaseFunction.apply("Program") + " " + concatFunction.apply("spring"));
        System.out.println(lowerCaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowerCaseFunction.compose(concatFunction).apply("PROGRAMMING"));
    }
}
