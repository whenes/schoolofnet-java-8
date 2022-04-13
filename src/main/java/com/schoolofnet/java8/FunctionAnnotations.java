package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;

public class FunctionAnnotations {
    public static void main(String[] args) {
        oldFunctionInterface();
        newFunctionalInterface();
    }

    private static void newFunctionalInterface() {
        MyInterface myInterface = (item) -> {
            System.out.println("Java 8 Functional Interface " + item);
        };
        myInterface.print("");

        // or

        List<String> numbers = Arrays.asList("1","2","3");
        numbers.forEach(myInterface::print);
        myInterface.body();
    }

    private static void oldFunctionInterface() {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print(String s) {
                System.out.println("Hello from old functional interface");
            }
        };
        myInterface.print("");
    }
}
