package com.schoolofnet.java8;

@FunctionalInterface
public interface MyInterface {
    void print(String s);

    default void body() {
        System.out.println("this is my interface functional body");
    }
}
