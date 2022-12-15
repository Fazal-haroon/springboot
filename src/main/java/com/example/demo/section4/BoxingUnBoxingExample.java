package com.example.demo.section4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;

        IntStream intStream = IntStream.rangeClosed(0, 10);
        numbers = intStream.boxed().collect(Collectors.toList());
        numbers.forEach(System.out::println);

        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        sum.ifPresent(integer -> System.out.println("sum.get() = " + integer));
        
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum1 = " + sum1);
    }
}
