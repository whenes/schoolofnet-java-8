package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    public static void main(String[] args) {
        oldRunnable();
        newLambdaRunnable();
        newCleanLambda();
        oldList();
        newLambdaList();
    }

    public static void newLambdaList() {
        List<String> strs = Arrays.asList("Will","Whenes", "Venes");
        strs.forEach(item -> System.out.println(item));

        List<String> endsWithS = strs.stream().filter(item -> item.endsWith("s")).collect(Collectors.toList());
        endsWithS.forEach(System.out::println);
    }

    public static void oldList() {
        List<String> strs = Arrays.asList("Will","Whenes", "Venes");
        for (String str : strs) {
            System.out.println(str);
        }
    }

    public static void newCleanLambda() {
        new Thread(() -> System.out.println("Full clean!")).start();
    }

    public static void newLambdaRunnable() {
        Runnable runnable1 = () -> System.out.println("Hello from lambda run!");
        new Thread(runnable1).start();
    }

    public static void oldRunnable() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from run method.");
            }
        };
        new Thread(runnable).start();
    }
}
