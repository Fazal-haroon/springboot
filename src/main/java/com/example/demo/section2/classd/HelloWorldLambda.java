package com.example.demo.section2.classd;

import com.example.demo.section2.interfaced.HelloWorldInterface;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld using lambda
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World";
        };
        //2nd way
        HelloWorldInterface helloWorldInterface2 = () -> "Hello World";
        System.out.println("helloWorldInterface = " + helloWorldInterface.sayHelloWorld());
    }
}
