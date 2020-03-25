package com.garood.java8.practice.streams;

import com.garood.java8.practice.repo.Person;
import com.garood.java8.practice.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {


    static Predicate<Person> p1 = (p) -> p.getAge() > 15;
    static Predicate<Person> p2 = (p) -> p.getName().startsWith("K");
    static BiConsumer<String,Integer> c = (p, a) -> System.out.println(p+"==="+a);

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        integerStream.forEach(p -> System.out.println(p));

        Stream<Integer> i2 = Stream.of(new Integer[]{1,2,3,4,5,6});
        i2.forEach(p -> System.out.println(p));


        Map<String,Integer> m1 = PersonRepository
                .getAllPersons()//iterate all persons
                .stream() // stream of persons
                .filter(p1.and(p2)) //apply the filters
                //.filter(p2)
                .collect(Collectors
                        .toMap(Person:: getName,Person :: getAge));


        m1.forEach(c);
        //System.out.println(m1);


        List<String> personsList = PersonRepository
                .getAllPersons()//list of persons
                .stream()//streams pf person
                .map(Person :: getName)//stream<List<String>>
                //.flatMap(List::stream)//Stream<String>
                .collect(Collectors.toList());

        System.out.println(personsList);
    }
}
