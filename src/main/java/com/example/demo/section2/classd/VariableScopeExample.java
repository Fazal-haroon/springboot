package com.example.demo.section2.classd;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScopeExample {
    //The body of a lambda expression has the same scope as a nested block
    //you cannot declare a parameter or a local variable in the lambda that has the same name as a local variable
    //you cannot modify the local variable inside the lambda expression
    //there are no restriction for class level/instant variable

    //Effectively final: In lambda you are allowed to use the local variable but you cannot
    // modify the local variable even though they are not declared as final, this condition is called effictively final
    /*
    int k = 10;
    List<Instructor> instructors = Instructors.getAll();
    instructors.forEach(instructor -> {
    sout(instructor + k++); //error as k is local variable
    });
    * */
    static int k = 10;
    public static void main(String[] args) {
        int b = 10;
        IntConsumer intConsumer = (a) -> System.out.println(a * 10);

//        int k = 0;
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            System.out.println(instructor + " " + k);
        });
//        k++;
    }
}
