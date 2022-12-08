package com.example.demo.section2.classd;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //if number is > 10 return true other false
        Predicate<Integer> p1 = (i) -> i>10;
        System.out.println(p1.test(100));

        System.out.println("----------------------------");

        //first check i > 10 && number is even number ( i % 2 == 0 )
        Predicate<Integer> p2 = (i) -> i % 2 == 0;
        System.out.println(p1.and(p2).test(97));

        System.out.println("----------------------------");

        //i > 10 || number is even number i % 2 == 0
        System.out.println(p1.or(p2).test(11));

        System.out.println("----------------------------");

        //i > 10 && i % 2 != 0
        System.out.println(p1.and(p2.negate()).test(13));
    }
}
