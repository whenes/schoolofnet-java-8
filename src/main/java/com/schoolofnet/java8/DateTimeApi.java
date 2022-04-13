package com.schoolofnet.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class DateTimeApi {
    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now();
        System.out.println(now);

        Thread.sleep(1000);
        Instant now2 = Instant.now();
        Duration dur = Duration.between(now, now2);
        System.out.println(dur.getSeconds());

        LocalDate local = LocalDate.now();
        System.out.println(local);

        LocalDate birthday1 = LocalDate.of(1988,01, 07);
        LocalDate birthday2 = LocalDate.of(2022, 04, 12);
        Period period = Period.between(birthday1, birthday2);
        System.out.printf("%s %s %s \n", period.getYears(), period.getMonths(), period.getDays());

        LocalDate newlocal = local.plusDays(1).plusMonths(2).plusYears(3);
        System.out.println(newlocal);
    }
}
