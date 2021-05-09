package com.garood.java.practice.defaultAndStatic;

import com.garood.java.practice.repo.Person;

import java.util.List;

public interface IPersonDetails {

    int sumOfAges(List<Person> personList);

    default double calculateSalary(List<Person> personList) {
        return personList.stream().map(Person::getSalary).reduce(0.0, (a, b) -> a + b);
    }
}
