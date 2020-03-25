package com.garood.java8.practice.repo;

import java.util.Optional;

public class Person {
    private String name;
    private int age;
    private Double salary;

    private Optional<Address> address;

    public Person(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(Optional<Address> address) {
        this.address = address;
    }
}
