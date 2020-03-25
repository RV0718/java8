package com.garood.java8.practice.streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class SequentialParallelStreamExample {

    public static void main(String[] args) {
        System.out.println("Available processor : " +Runtime.getRuntime().availableProcessors());

        String[] str = {"asc", "wer", "edfg", "effg",
                "rfget", "agasv", "avasvd", "asvcasd", "avsav",
                "avsav", "avasdv", "avasv"};


        printStream(Arrays.stream(str).sequential());
        System.out.println("--------Parallel--------------");
        printStream(Arrays.stream(str).parallel());
    }


    static void printStream(Stream<String> stream) {
        stream.forEach(s -> {
            System.out.println(LocalTime.now() + " Value : " + s + " thread name : " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
