package com.garood.java.practice.streams;

import com.garood.java.practice.repo.PersonRepository;

import java.util.stream.Collectors;

public class StreamCollectingExample {

    static long countTallPerson() {
        /*return PersonRepository
                .getAllPersons()
                .stream()
                .filter(p->p.getAge() >=3)
                .count();*/

        return PersonRepository
                .getAllPersons()
                .stream()
                .filter(p -> p.getAge() >= 3)
                .collect(Collectors.counting());
    }


    public static void main(String[] args) {
        System.out.println(countTallPerson());
    }
}
