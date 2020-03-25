package com.garood.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7VsJava8Example2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ravi","Sam","Kala","Ravi");

        List<String> uniqueList = new ArrayList<>();
        for(String s : list){
            if(!uniqueList.contains(s)){
                uniqueList.add(s);
            }
        }

        System.out.println("Before java 8 data is :" +uniqueList);

        List<String> uniqueList2 = list.stream().distinct().collect(Collectors.toList());

        System.out.println("After java 8 data is :" +uniqueList);
    }
}
