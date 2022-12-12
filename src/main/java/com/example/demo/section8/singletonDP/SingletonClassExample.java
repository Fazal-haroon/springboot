package com.example.demo.section8.singletonDP;

final public class SingletonClassExample {

    //to make our class is final b/c if SingleClassExample perform inheritance then we can create new instance object for this class
    //A.class
    //B.class
    //B extends A
    //A a = new B();

    //Class Loader, before the getInstance() call the object is created during class loading time.
    //this is called as Eager Initialization

//    static SingletonClassExample s = new SingletonClassExample(); //Eager Initialization
    static SingletonClassExample s2 = null; //Lazy initialization

    private SingletonClassExample() throws Exception{

    }

    {
        //instance initializer block in java
        if (s2 != null){
            throw new Exception("Object is already present");
        }
    }

    static SingletonClassExample getInstance() throws Exception{
        if(s2 == null){
            s2 = new SingletonClassExample();
        }
        return s2;
    }
}
