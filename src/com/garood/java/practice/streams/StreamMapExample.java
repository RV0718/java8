package com.garood.java.practice.streams;

import com.garood.java.practice.repo.Person;
import com.garood.java.practice.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapExample {

    static Consumer<String> c2 = (c) -> c.toUpperCase();
    static Function<Person, String> c1 = (c) -> c.getName().toUpperCase();

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Mango", "Banana", "Apple", "Peers");

        List<Integer> l2 = l1.stream()
                .map(String::length)
                //.map((s) -> s.length())
                .collect(Collectors.toList());

        System.out.println("Fruits length===" + l2);

        List<String> l3 = PersonRepository
                .getAllPersons()
                .stream()
                .map(c1)
                //.map((s) -> s.length())
                .collect(Collectors.toList());


        System.out.println(l3);
        l3.stream().forEach(System.out::println);

    }
}
