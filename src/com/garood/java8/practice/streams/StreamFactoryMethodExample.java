package com.garood.java8.practice.streams;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {

    static UnaryOperator<Integer> add = x->x+5;

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0,add).limit(15);
        stream.forEach(System.out::println);


        Stream<Double> dStream = Stream.generate(Math :: random).limit(15);
        dStream.forEach(System.out::println);

        Stream.of(1,2,3,4,23,34,45,23).forEach(System.out::println);
    }
}
