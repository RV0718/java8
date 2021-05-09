package com.garood.java.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionNCopiesExample {

    public static void main(String[] args) {
        Collection<String> col = List.of("A", "B", "C");


        List<Collection<String>> nCopies = Collections.nCopies(5, col);


        nCopies.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}
