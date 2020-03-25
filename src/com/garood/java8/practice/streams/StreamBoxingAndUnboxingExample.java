package com.garood.java8.practice.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingAndUnboxingExample {

    static List<Integer> boxingMethod(){
        return IntStream.rangeClosed(1,34)
                .boxed()
                .collect(Collectors.toList());
    }

    static int unboxingMethod(List<Integer> l1) {
        return l1.stream().mapToInt(Integer :: intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : "+boxingMethod());
        System.out.println("UnBoxing : "+unboxingMethod(boxingMethod()));
    }
}
