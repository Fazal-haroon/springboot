package com.example.demo.section4;

import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(11, 2, 3, 4, 5, 6, 7, 12, 1);
        //stream min function
        Optional result = numbers.stream().min(Integer::compareTo);
        if (result.isPresent()) {
            System.out.println("result.get() = " + result.get());
        }

        //reduce function
        //(0,11) - 0
        //(0,2) - 0
        int result2 = numbers.stream().reduce(0, (a, b) -> a < b ? a : b);
        System.out.println("result2 = " + result2);

        Optional result3 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        if (result3.isPresent()) {
            System.out.println("result3 = " + result3.get());
        }

        Optional result4 = numbers.stream().reduce(Integer::min);
        if (result4.isPresent()) {
            System.out.println("result4.get() = " + result4.get());
        }
    }
}
