package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Lemon", "Mangoes", "Tomato", "Grape");

        fruits.forEach(System.out::println);
        fruits.forEach(str -> {
            Person.say("");
        });
        fruits.forEach(Person::say);
    }
}
