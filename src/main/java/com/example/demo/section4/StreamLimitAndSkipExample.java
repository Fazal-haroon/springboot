package com.example.demo.section4;

import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 8, 5, 6, 7, 9);
        List limit5Numbers = numbers.stream().limit(5).collect(Collectors.toList());
        limit5Numbers.forEach(System.out::println);

        System.out.println("--------------");
        List skip5Numbers = numbers.stream().skip(5).collect(Collectors.toList());
        skip5Numbers.forEach(System.out::println);
    }
}
