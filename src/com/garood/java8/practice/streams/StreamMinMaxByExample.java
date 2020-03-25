package com.garood.java8.practice.streams;

import com.garood.java8.practice.repo.Person;
import com.garood.java8.practice.repo.PersonRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMinMaxByExample {

    public static void main(String[] args) {
        System.out.println(getOldestPerson());
        System.out.println(getYoungestPerson());
        System.out.println(filterTallestPersons());
    }

    static Optional<Person> getOldestPerson() {
        return PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors
                        .maxBy(Comparator.comparing(Person::getAge)));
    }

    static Optional<Person> getYoungestPerson() {
        return PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors
                        .minBy(Comparator.comparing(Person::getAge)));
    }

    static List<Person> filterTallestPersons() {
        List<Person> p = new ArrayList<>();

        Optional<Person> op = getOldestPerson();
        Person per = op.isPresent() ? op.get() : null;
        if (null != per) {
            p = PersonRepository.getAllPersons()
                    .stream()
                    .filter(p1 -> p1.getAge() == per.getAge())
                    .collect(Collectors.toList());
        }
        return p;

    }
}
