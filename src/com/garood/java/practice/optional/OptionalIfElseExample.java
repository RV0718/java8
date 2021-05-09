package com.garood.java.practice.optional;

import com.garood.java.practice.repo.Person;
import com.garood.java.practice.repo.PersonRepository;

import java.util.Optional;

public class OptionalIfElseExample {

    public static void main(String[] args) {
        //orElse();
        //orElseGet();
        orElseThrow();
    }

    static void orElse() {
        Optional<Person> op = PersonRepository.optionalPerson();
        //String name = op.isPresent() ? op.get().getName() : "No Data Found";
        String name = op.map(Person::getName).orElse("No Data Found");
        System.out.println("Person Name : " + name);
    }

    static void orElseGet() {
        Optional<Person> op = PersonRepository.optionalPerson();
        String name = op.map(Person::getName).orElseGet(
                () -> "No Data Found"
        );
        System.out.println("Person Name : " + name);
    }

    static void orElseThrow() {
        Optional<Person> op = PersonRepository.optionalPerson();
        String name = op.map(Person::getName).orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println("Person Name : " + name);
    }
}
