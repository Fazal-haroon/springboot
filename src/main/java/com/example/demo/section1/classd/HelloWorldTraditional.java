package com.example.demo.section1.classd;

import com.example.demo.section1.interfaced.HelloWorldInterface;

public class HelloWorldTraditional implements HelloWorldInterface {
    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println("helloWorldTraditional.sayHelloWorld() = " + helloWorldTraditional.sayHelloWorld());
    }
}