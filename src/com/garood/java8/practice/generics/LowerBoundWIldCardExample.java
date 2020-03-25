package com.garood.java8.practice.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWIldCardExample {

    public static void main(String[] args) {
        List<Serializable> li = new ArrayList<>(){
            {
                add(12);
                add(123);
            }
        };
        //sum(Arrays.asList(1.2,2.3,4));
        sum(li);
    }

    static void sum(List<? super Number> list){
        list.add(new Integer(12));
        /*Object sum=0.0;
        for(Object n : list){
            sum = sum + n;
        }*/
        System.out.println("Sum is : "+list);
    }

}
