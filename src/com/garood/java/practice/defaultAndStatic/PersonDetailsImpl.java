package com.garood.java.practice.defaultAndStatic;

import com.garood.java.practice.repo.Person;

import java.util.List;

public class PersonDetailsImpl implements IPersonDetails {
    @Override
    public int sumOfAges(List<Person> personList) {
        return personList.stream()
                .map(Person::getAge)
                .reduce(0, (a, b) -> a + b);
    }
}
