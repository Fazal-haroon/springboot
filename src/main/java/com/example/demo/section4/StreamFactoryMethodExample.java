package com.example.demo.section4;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        //of stream example
        Stream<Integer> stream = Stream.of(1, 22, 53, 2, 52, 7, 9);
        stream.forEach(System.out::println);

        System.out.println("------------------------");
        //iterate generate a stram of 10 odd numbers
        Stream<Integer> stream1 = Stream.iterate(1, integer -> integer + 2).limit(10);
        stream1.forEach(System.out::println);

        System.out.println("------------------------");
        //geneate 10 random numbers
        Stream<Integer> stream2 = Stream.generate(new Random(10)::nextInt).limit(10);
        stream2.forEach(System.out::println);
    }
}
