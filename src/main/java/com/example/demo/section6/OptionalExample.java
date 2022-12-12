package com.example.demo.section6;

import java.util.Optional;

public class OptionalExample {
    //as a java programmer we all are familiar with NullPointerException
    //NullPointerException can crash your code and it is very hard to avoid it without using many null checks
    //Java 8 has introduced a new Optional class in java.util package. this class can help in avoiding null checks
    public static void main(String[] args) {
        /*
        Integer[] numbers = new Integer[10];
        int number = numbers[1].intValue();
        System.out.println("number = " + number);
        */
        Integer[] numbers = new Integer[10];
        Optional<Integer> checkNullInt = Optional.ofNullable(numbers[1]);
        int result = checkNullInt.isPresent() ? checkNullInt.get() : -1;
        System.out.println("result = " + result);
        System.out.println("------------------");

        Optional<String> stringOptional = Optional.of("Hello World");
        System.out.println("stringOptional = " + stringOptional.get());
        System.out.println("------------------");

/*
        Optional<String> stringOptional2 = Optional.of(null);
        System.out.println("stringOptional2 = " + stringOptional2.get());
        System.out.println("------------------");
*/

        System.out.println("getWords() = " + getWords().get());
        System.out.println("getWords() = " + getWords());
        System.out.println("------------------");

        //orElse
        Integer[] numbers2 = new Integer[10];
        numbers2[0] = 1;
        Optional<Integer> integer = Optional.ofNullable(numbers[1]);
        System.out.println("integer = " + integer);
        int result2 = integer.orElse(-1);
        System.out.println("result2 = " + result2);

        //orElseGet
        result2 = integer.orElseGet(() -> -1);
        System.out.println("result2 = " + result2);

        //orElseThrow
        /*
        try {
            result2 = integer.orElseThrow(Exception::new);
            System.out.println("result2 = " + result2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */

        //ifPresent and isPresent
        Optional<String> stringOptional1 = Optional.ofNullable("Hello Java8");
        if (stringOptional1.isPresent()) {
            System.out.println("stringOptional1 = " + stringOptional1);
        }
        stringOptional1.ifPresent(s -> System.out.println("s = " + s));
    }

    
    public static Optional<String> getWords(){
        String[] words = new String[10];
        words[1] = "test";
        Optional<String> optionalS = Optional.ofNullable(words[1]);
        if (optionalS.isPresent()) {
            return optionalS;
        } else {
            return Optional.empty();
        }
    }
}
