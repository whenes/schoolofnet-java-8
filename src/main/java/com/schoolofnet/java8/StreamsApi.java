package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsApi {
    public static void main(String[] args) {
        filter();
    }

    private static void filter() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 0);
        List<Integer> numbersWithoutZero = numbers.stream()
                                                    .filter(item -> item != 0)
                                                    .collect(Collectors.toList());
        numbersWithoutZero.forEach(System.out::println);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f", "");
        List<String> emptyLetters = letters.stream()
                                            .filter(item -> !item.isEmpty())
                                            .collect(Collectors.toList());
        emptyLetters.forEach(System.out::println);


        List<String> parallelLetters = Arrays.asList("a", "b", "c", "d", "e", "f", "");
        List<String> emptyParallelLetters = parallelLetters.parallelStream()
                .filter(item -> !item.isEmpty())
                .collect(Collectors.toList());
        emptyParallelLetters.forEach(System.out::println);

        Random hash = new Random();
        hash.doubles()
            .limit(2)
            .forEach(System.out::println);

        String lettersJoin = parallelLetters.stream()
                                            .filter(item -> !item.isEmpty())
                                            .collect(Collectors.joining());
        System.out.println(lettersJoin);

    }
}
