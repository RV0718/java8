package com.garood.java8.practice.repo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    public static List<Person> getAllPersons(){
        Person p1 = new Person("Ravi",12,52000d);
        Person p2 = new Person("Payal",42,52600d);
        Person p3 = new Person("Kamal",32,82000d);
        Person p4 = new Person("Sam",22,902000d);
        Person p5 = new Person("Mike",42,9028700d);

        return Arrays.asList(p1,p2,p3,p4,p5);
    }

    public static List<Person> getAllPersonsWithNull(){
        Person p1 = new Person("Ravi",12,52000d);
        Person p2 = new Person("Payal",42,52600d);
        Person p3 = new Person("Kamal",32,82000d);
        Person p4 = new Person("Sam",22,902000d);
        Person p5 = new Person("Mike",42,9028700d);

        return Arrays.asList(p1,p2,p3,p4,p5,null);
    }

    public static Optional<Person> optionalPerson(){
        return Optional.of(getPerson());
    }

    public static Person getPerson(){
        Address address = new Address("a","b","c");
        Optional<Address> addr = Optional.ofNullable(address);
        Person p = getAllPersons().get(0);
        p.setAddress(addr);
        return p;
    }
}
