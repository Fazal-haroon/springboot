package com.example.demo.section9.jshellJava9Introduction;

public class JavaNiceIntroduction2 {
    /*
    * Java 9 introduced an abstraction layer on top of the packages which is known as java platform module system
    *
    * JDK itself is modularize now and it's divided into more than 90 separate modules
    *
    * * there is the list of modules in 15jshell.png
    *
    * Modular JDK advantage:
    * 1. Increased Security
    * with the modulation, modules can explicitly exposed some of the packages and strongly encapsulate other packages. There are so many internal implementation of JDK with does not need to the exposed outside.
    * 2. Reduced Footprint
    * you can now only include the necessary module which will reduce the footprint of your application
    * 3. Easy Deprecation
    * deprecation is easy with the modular system, the incubator modules can be release and if it is stable they can be converted to the next major release
    * 4. What is java module.
    * It is a mechanism to package your java application and packages into java modules. A module can specify which packages should be visible to other modules. A java module slaso need to specify which other java modules are required to do its function.
    *
    * */
}
