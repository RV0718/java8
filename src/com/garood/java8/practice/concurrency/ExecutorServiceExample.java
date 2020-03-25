package com.garood.java8.practice.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceExample {


    AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        int i = 0;
        MyTask myTask = new MyTask(i);
        MyTask myTask1 = new MyTask(i);
        MyTask myTask2 = new MyTask(i);
        MyTask myTask3 = new MyTask(i);
        executorService.submit(myTask);
        executorService.submit(myTask1);
        executorService.submit(myTask);
        executorService.submit(myTask2);
        executorService.submit(myTask);
        executorService.submit(myTask3);
        executorService.submit(myTask);
        executorService.submit(myTask);
        executorService.submit(myTask);
        executorService.submit(myTask);

        executorService.shutdown();
    }
}

class MyTask extends Thread{

    int i;

    AtomicInteger atomicInteger = new AtomicInteger(1);

    public MyTask(int i){
        this.i=i;
    }


    @Override
    public void run(){
        System.out.println("Running in thread 1 : "+(i++)+" Thread Name is : "+Thread.currentThread().getName());
        //System.out.println("Atomic Integer in thread 1 : "+atomicInteger.incrementAndGet()+" Thread Name is : "+Thread.currentThread().getName());
    }
}

