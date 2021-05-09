package com.garood.java.practice.defaultAndStatic;

import com.garood.java.practice.repo.Person;
import com.garood.java.practice.repo.PersonRepository;

import java.util.Comparator;
import java.util.List;

public class DefaultCustomSortExample {

    static Comparator<Person> byName = Comparator.comparing(Person::getName);
    static Comparator<Person> byAge = Comparator.comparing(Person::getAge);

    public static void main(String[] args) {
        List<Person> lp = PersonRepository.getAllPersons();
        sortByName(lp);

        System.out.println("SORTING THEN EXAMPLE");
        sortByNameTheByAge(lp);


        System.out.println("SORTING THEN EXAMPLE WITH NULL");
        sortByNameAndNullFirst(PersonRepository.getAllPersonsWithNull());
    }

    static void sortByName(List<Person> listOfPersons) {
        listOfPersons.sort(byName);
        listOfPersons.forEach(System.out::println);
    }

    static void sortByNameTheByAge(List<Person> listOfPersons) {
        listOfPersons.sort(byName.thenComparing(byAge));
        listOfPersons.forEach(System.out::println);
    }

    static void sortByNameAndNullFirst(List<Person> listOfPersons) {
        Comparator<Person> nullComp = Comparator.nullsFirst(byName);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(System.out::println);
    }

}
