package com.example.demo.section2.classd;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a + b;
        System.out.println("binaryOperator = " + binaryOperator.apply(23,4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(8, 2));

        BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
        System.out.println("minBi = " + minBi.apply(3,5));

        IntBinaryOperator intBi = (a,b) -> a*b;
        System.out.println(intBi.applyAsInt(2, 5));

        LongBinaryOperator longBi = (a,b) -> a*b;
        System.out.println("longBi = " + longBi.applyAsLong(25342342L, 234233423L));

        DoubleBinaryOperator doubleBi = (a,b) -> a*b;
        System.out.println("doubleBi.applyAsDouble(2,5.223) = " + doubleBi.applyAsDouble(2,5.223));
    }
}
