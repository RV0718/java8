package com.garood.java8.practice.optional;

import com.garood.java8.practice.repo.Address;
import com.garood.java8.practice.repo.Person;
import com.garood.java8.practice.repo.PersonRepository;

import java.util.Optional;

public class OptionalMapExample {

    public static void main(String[] args) {
        optionalMapExample();
        optionalFlatMapExample();
        optionalFlatMapFilterExample();
    }

    static void optionalMapExample(){
        Optional<Person> op = PersonRepository.optionalPerson();

        op.ifPresent((per) -> {
            String name = op.map(Person::getName).orElse("NDF");
            System.out.println("Name is : "+name);
        });
    }


    static void optionalFlatMapExample(){
        Optional<Person> op = PersonRepository.optionalPerson();
        if(op.isPresent()){
            Optional<Address> oa = op.flatMap(Person::getAddress);
            System.out.println("Address is : "+oa.get());
        }
    }

    static void optionalFlatMapFilterExample(){
        Optional<Person> op = PersonRepository.optionalPerson().filter(p->p.getAddress().get().getBlock().equals("Z"));
        if(op.isPresent()){
            Optional<Address> oa = op.flatMap(Person::getAddress);
            System.out.println("Filter Address is : "+oa.get());
        }
    }
}
