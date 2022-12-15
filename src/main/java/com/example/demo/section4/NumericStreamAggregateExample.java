package com.example.demo.section4;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //sum
        int sum = IntStream.rangeClosed(0, 1000).sum();
        System.out.println("sum of 1000 num : " + sum);

        //min
        OptionalInt min = IntStream.rangeClosed(0, 1000).min();
        if (min.isPresent())
            System.out.println("Min of 1000 num : "+ min.getAsInt());

        //max
        OptionalInt max = IntStream.rangeClosed(0, 1000).max();
        if(max.isPresent())
            System.out.println("Max of 1000 num : "+ max.getAsInt());

        //average
        OptionalDouble average = LongStream.rangeClosed(0,1022).asDoubleStream().average();
        System.out.println("average = " + (average.isPresent() ? average.getAsDouble() : 0.0));
    }
}
