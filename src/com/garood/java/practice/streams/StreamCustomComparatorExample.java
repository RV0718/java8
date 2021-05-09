package com.garood.java.practice.streams;

import com.garood.java.practice.repo.Person;
import com.garood.java.practice.repo.PersonRepository;

import java.util.Comparator;

public class StreamCustomComparatorExample {

    public static void main(String[] args) {
        PersonRepository
                .getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);


        System.out.println("Printing in reverse order");
        PersonRepository
                .getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);

        System.out.println("Printing with two comparator");
        PersonRepository
                .getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

    }
}
