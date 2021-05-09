package com.garood.java.practice;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> p1 = p -> p <= 40;
        Predicate<Integer> p2 = p -> p > 40;

        System.out.println(p1.test(20));
        System.out.println(p2.test(20));

        System.out.println(p2.and(p1).test(20));
        System.out.println(p2.or(p1).test(20));
    }
}
