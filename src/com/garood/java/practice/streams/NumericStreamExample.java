package com.garood.java.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class NumericStreamExample {

    static IntPredicate prime = p -> p % 2 == 0;

    static int calculateSum(List<Integer> l1) {
        return l1.stream().reduce(0, Integer::sum);
    }

    static int calculateSumWithStream(IntStream l1) {
        return l1.sum();
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Total is : " + calculateSum(l1));


        IntStream intStream = IntStream.rangeClosed(0, 56);
        System.out.println("Using INTSTREAM ::" + calculateSumWithStream(intStream));


        IntStream.rangeClosed(0, 50).filter(prime).forEach(System.out::println);
    }
}
