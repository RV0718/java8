package com.garood.java.practice.optional;

import com.garood.java.practice.repo.Person;
import com.garood.java.practice.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        System.out.println("My Name : " + myName("Ravi"));

        Optional<String> optional = Optional.ofNullable(myName("Ravi"));
        System.out.println("With Optional : " + optional);

        Optional<String> optional1 = Optional.ofNullable(myName("Ravi"));
        System.out.println("With Optional Get : " + (optional1.isPresent() ? optional1.get() : "No Data Found"));


        System.out.println("Person Name is : " + personName(new Person()));

        Optional<String> per = personNameWithOptional(PersonRepository.optionalPerson());

        System.out.println("Optional Person Name is : " + per.get());

        Optional<String> per1 = personNameWithOptional(Optional.of(new Person()));

        System.out.println("Optional of Person Name is : " + per1.get());

    }

    static String myName(String name) {
        return name;
    }


    static String personName(Person person) {
        if (person != null) {
            return person.getName();
        } else {
            return "No Data Found";
        }

    }

    static Optional<String> personNameWithOptional(Optional<Person> per) {
        if (per.isPresent())
            return per.map(Person::getName);
        else
            return Optional.empty();
    }
}
