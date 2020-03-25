package com.garood.java8.practice.optional;

import java.util.Optional;

public class OptionPresentExample {

    public static void main(String[] args) {
        Optional<String> of = Optional.ofNullable("JAVA8");
        System.out.println(of.isPresent() ? of.get() : "NDF");
    }



}
