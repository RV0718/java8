package com.garood.java.practice.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWIldCardExample {

    public static void main(String[] args) {
        sum(Arrays.asList(1.2, 2.3, 4));
    }

    static void sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        System.out.println("Sum is : " + sum);
    }
}
