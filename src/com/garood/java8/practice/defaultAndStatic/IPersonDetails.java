package com.garood.java8.practice.defaultAndStatic;

import com.garood.java8.practice.repo.Person;

import java.util.List;

public interface IPersonDetails {

    int sumOfAges(List<Person> personList);

    default double calculateSalary(List<Person> personList){
        return personList.stream().map(Person::getSalary).reduce(0.0,(a,b)->a+b);
    }
}
