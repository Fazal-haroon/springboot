package com.example.demo.section7;

import java.util.*;

public class DefaultStaticInInterface {
    /*
    * All the methods of interfaces were public and abstract by default
    * Java 8 allows the interfaces to have default and static methods
    * Default method is introduced in java 8 to add new methods in the existing interfaces in such a way so that they are backward compatible
    * Static methods in interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces.
    * */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "syed", "Jenny", "Gene", "Rajeev");
        Collections.sort(names);
        System.out.println("names = " + names);

        //use List default method of sort
        names.sort(Comparator.naturalOrder());
        System.out.println("names = " + names);


    }
}
