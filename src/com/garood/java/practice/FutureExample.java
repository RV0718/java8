package com.garood.java.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureExample {


    public static void main(String[] args) throws Exception {
        Test test = new Test();
        Future<Integer> squared = test.squared(5);

        System.out.println(String.format("Squared result is %d", squared.get(500, TimeUnit.SECONDS)));

//        while(!squared.isDone()){
//            System.out.println("Still calculating");
//            Thread.sleep(500);
//        }
//
//        System.out.println(String.format("Squared result is %d", squared.get()));

    }


}


class Test {
    private ExecutorService executor = Executors.newFixedThreadPool(2);

    public Future<Integer> squared(int input) throws Exception {
        return executor.submit(() -> {
            Thread.sleep(2000);
            return input * input;
        });
    }
}
