package com.garood.java.practice.defaultAndStatic;

import com.garood.java.practice.repo.PersonRepository;
import com.garood.java.practice.repo.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {

    public static void main(String[] args) {
        List<String> namesList = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        /*
        System.out.println("Names List Before Sort: ");
        namesList.forEach((nl) -> {

            System.out.println(nl);
        });

        System.out.println("Names List After Sort: ");
        Collections.sort(namesList);
        namesList.forEach((nl) -> {

            System.out.println(nl);
        });*/


        System.out.println("Natural Order Sorting");
        namesList.sort(Comparator.naturalOrder());
        namesList.forEach(System.out::println);

        System.out.println("Reverse Order Sorting");
        namesList.sort(Comparator.reverseOrder());
        namesList.forEach(System.out::println);
    }


}
