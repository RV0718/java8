package com.garood.java.practice.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9);

        System.out.println(i.stream().mapToInt(j -> j).sum());

        System.out.println(i.stream().reduce(1, (a, b) -> a * b));
        System.out.println(i.stream().reduce(0, (a, b) -> a + b));
    }
}
