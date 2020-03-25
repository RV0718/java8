package com.garood.java8.practice;

import com.garood.java8.practice.repo.Person;
import com.garood.java8.practice.repo.PersonRepository;

import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<String> c1 = (s) -> System.out.println(s.toLowerCase());
    static Consumer<String> c2 = (s) -> System.out.println(s+" working");
    static Consumer<Person> c3 = (s) -> System.out.println(s.toString());

    public static void main(String[] args) {
        c1.accept("Ravi");

        c2.accept("Hello");

        c2.andThen(c1).accept("Wow!!");

        printAllPersons();

    }

    private static void printAllPersons() {
        PersonRepository.getAllPersons().forEach(c3);
    }
}
