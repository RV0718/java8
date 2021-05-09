package com.garood.java.practice.streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialParallelWithTimeStreamExample {

    static long checkPerformance(Supplier<Integer> sum, int numOfTimes) {

        long start = System.currentTimeMillis();

        for (int i = 0; i <= numOfTimes; i++) {
            sum.get();
        }
        long end = System.currentTimeMillis();
        return end - start;

    }

    public static void main(String[] args) {
        //System.out.println("Sum from Seq : "+sumMethodUsingSeq());
        //System.out.println("Sum from Parallel : "+sumMethodUsingParallel());

        System.out.println("Sum from Seq : " + checkPerformance(SequentialParallelWithTimeStreamExample::sumMethodUsingSeq, 50));
        System.out.println("Sum from Parallel : " + checkPerformance(SequentialParallelWithTimeStreamExample::sumMethodUsingParallel, 50));
    }

    static int sumMethodUsingSeq() {
        return IntStream.rangeClosed(0, 20000).sum();
    }


    static int sumMethodUsingParallel() {
        return IntStream.rangeClosed(0, 20000).parallel().sum();
    }
}
