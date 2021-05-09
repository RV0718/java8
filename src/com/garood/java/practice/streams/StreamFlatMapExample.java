package com.garood.java.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {
        List<Integer> o = Arrays.asList(1, 3, 5, 7);
        List<Integer> e = Arrays.asList(2, 4, 6);

        List<List<Integer>> oe = Arrays.asList(o, e);

        System.out.println("Before flatten===" + oe);


        List<Integer> flattenList =
                oe.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println("After Flatten===" + flattenList);


    }
}
