package com.example.demo.section5;

import com.example.demo.section2.classd.Instructor;
import com.example.demo.section2.classd.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("A", "J", "K", "F").collect(Collectors.joining());
        System.out.println("result = " + result);
        System.out.println("------------------");

        result = Stream.of("F","I","S","H").collect(Collectors.joining(","));
        System.out.println("result = " + result);

        result = Stream.of("F","I","S","H").collect(Collectors.joining(".","{","}"));
        System.out.println("result = " + result);

        //instructors names separated by | and prefix { and suffix }
        String namesInverstedComma = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.joining(" | ","{","}"));
        System.out.println("namesInverstedComma = " + namesInverstedComma);

    }
}
