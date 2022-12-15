package com.example.demo.section4;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class IntStreamLongStreamDoubleStreamExample {
    public static void main(String[] args) {
        /*
        //Using of
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        //iterate
        System.out.println("---------------------");
        numbers = IntStream.iterate(0, i -> i + 2).limit(5);
        numbers.forEach(System.out::println);

        //random genrator
        System.out.println("---------------------");
        numbers = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(5);
        numbers.forEach(System.out::println);

        //1 to 4, 5 is exclusive
        System.out.println("---------------------");
        numbers = IntStream.range(1, 5);
        numbers.forEach(System.out::println);

        //1 to 5, 5 is inclusive
        System.out.println("---------------------");
        numbers = IntStream.rangeClosed(1, 5);
        numbers.forEach(System.out::println);
        */

       /*
       //Using of
        LongStream numbers = LongStream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        //iterate
        System.out.println("---------------------");
        numbers = LongStream.iterate(0, i -> i + 2).limit(5);
        numbers.forEach(System.out::println);

        //random genrator
        System.out.println("---------------------");
        numbers = LongStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(5);
        numbers.forEach(System.out::println);

        //1 to 4, 5 is exclusive
        System.out.println("---------------------");
        numbers = LongStream.range(1, 5);
        numbers.forEach(System.out::println);

        //1 to 5, 5 is inclusive
        System.out.println("---------------------");
        numbers = LongStream.rangeClosed(1, 5);
        numbers.forEach(System.out::println);
        */

        //Using of
        DoubleStream numbers = DoubleStream.of(1.4, 2.2, 3.5, 4.9, 5.43);
        numbers.forEach(System.out::println);

        //iterate
        System.out.println("---------------------");
        numbers = DoubleStream.iterate(0, i -> i + 2).limit(5);
        numbers.forEach(System.out::println);

        //random genrator
        System.out.println("---------------------");
        numbers = DoubleStream.generate(() -> ThreadLocalRandom.current().nextDouble(10)).limit(5);
        numbers.forEach(System.out::println);

        //1 to 4, 5 is exclusive
        System.out.println("---------------------");
        numbers = LongStream.range(1,5).asDoubleStream();
        numbers.forEach(System.out::println);

        //1 to 5, 5 is inclusive
        System.out.println("---------------------");
        numbers = LongStream.rangeClosed(1,5).asDoubleStream();
        numbers.forEach(System.out::println);
    }
}
