package com.example.demo.section2.classd;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = i -> i * 10;
        System.out.println(unary.apply(5));
        //both are same but if the input and return type same then use UnaryOperator
        Function<Integer, Integer> function = i -> i * 10;
        System.out.println(function.apply(50));

        IntUnaryOperator intUnaryOperator = i -> i * 10;
        System.out.println("intUnaryOperator.applyAsInt(100) = " + intUnaryOperator.applyAsInt(100));

        LongUnaryOperator longUnaryOperator = i -> i * 10;
        System.out.println("longUnaryOperator.applyAsLong(100) = " + longUnaryOperator.applyAsLong(100L));

        DoubleUnaryOperator doubleUnaryOperator = i -> i * 10;
        System.out.println("doubleUnaryOperator.applyAsDouble(100.22) = " + doubleUnaryOperator.applyAsDouble(100.22));
    }
}
