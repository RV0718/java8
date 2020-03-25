package com.garood.java8.practice.defaultAndStatic;

import com.garood.java8.practice.repo.Person;
import com.garood.java8.practice.repo.PersonRepository;

import java.util.List;

public class PersonDetailClient {

    static List<Person> lp = PersonRepository.getAllPersons();

    public static void main(String[] args) {
        PersonDetailsImpl pd = new PersonDetailsImpl();
        System.out.println("SUm Of AGe is : "+pd.sumOfAges(lp));



        System.out.println("SUm Of Salary is : "+pd.calculateSalary(lp));

    }
}
