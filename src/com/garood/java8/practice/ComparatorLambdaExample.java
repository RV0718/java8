package com.garood.java8.practice;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        //Before
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.compareTo(o2) > 0){
                    return 1;
                }else if(o1.compareTo(o2) < 0){
                    return -1;
                }else{
                    return 0;
                }
            }
        };

        System.out.println("Data :"+c1.compare(2,1));
        System.out.println("Data :"+c1.compare(2,2));
        System.out.println("Data :"+c1.compare(2,4));

        //After

        Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
        System.out.println("Data :"+c2.compare(2,1));
        System.out.println("Data :"+c2.compare(2,2));
        System.out.println("Data :"+c2.compare(2,4));
    }
}
