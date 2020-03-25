package com.garood.java8.practice;

import java.util.stream.IntStream;

public class Java7VsJava8Example {

    public static void main(String[] args) {
        //before java 8
        int total=0;
        for(int i=0;i<=50;i++){
            total+=i;
        }
        System.out.println("before java 8 sum is :"+total);


        int total1 = IntStream.rangeClosed(0,50)
                .map(Integer :: new)
                .sum();

        System.out.println("after java 8 sum is:"+total1);


    }
}
