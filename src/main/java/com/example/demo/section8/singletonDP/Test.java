package com.example.demo.section8.singletonDP;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        SingletonClassExample1 s1 = new SingletonClassExample1();
        System.out.println("s1.hashCode() = " + s1.hashCode());

        SingletonClassExample1 s2 = new SingletonClassExample1();
        System.out.println("s2.hashCode() = " + s2.hashCode());

        SingletonClassExample1 s3 = new SingletonClassExample1();
        System.out.println("s3.hashCode() = " + s3.hashCode());

        SingletonClassExample s4 = SingletonClassExample.getInstance();
        System.out.println("s4.hashCode() = " + s4.hashCode());

        SingletonClassExample s5 = SingletonClassExample.getInstance();
        System.out.println("s5.hashCode() = " + s5.hashCode());

        //reflection
        Constructor<SingletonClassExample> sr = SingletonClassExample.class.getDeclaredConstructor();
        sr.setAccessible(true);
        System.out.println("sr.hashCode() = " + sr.hashCode());

        SingletonClassExample s6 = SingletonClassExample.getInstance();
        System.out.println("s6.hashCode() = " + s6.hashCode());
    }
}
