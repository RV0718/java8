package com.garood.java8.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollectionEx {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");

        for(String name : l1){
            System.out.println(">>>>"+name);
        }

        l1.forEach((l) -> System.out.println(">>>>>"+l));
        l1.forEach((l) -> System.out.println(">>>>>"+l));

        Stream<String> s1 = l1.stream();
        s1.forEach((l) -> System.out.println(">>>>>"+l));

        //throw the error if try to use the same stream again
        //s1.forEach((l) -> System.out.println(">>>>>"+l));

    }
}
