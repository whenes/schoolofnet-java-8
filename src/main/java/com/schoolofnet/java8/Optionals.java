package com.schoolofnet.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<OptionPerson> people = new ArrayList<>();

        OptionPerson p1 = new OptionPerson("will");
        OptionPerson p2 = new OptionPerson("whenes");
        OptionPerson p3 = new OptionPerson("venes");
        OptionPerson p4 = new OptionPerson(null);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

//        people.forEach(p -> System.out.println(p.getName()));

        Optional<OptionPerson> op = Optional.of(p1);
        op.ifPresent(p -> System.out.println(p.getName()));

        String name = p4.getName();
//        Optional<String> ops = Optional.of(name);
        Optional<String> ops = Optional.ofNullable(name);
        ops.ifPresent(System.out::println);
    }
}
