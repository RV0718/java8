package com.garood.java.practice;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        //Before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is called thread 1");
            }
        };
        new Thread(t1).start();


        //After
        Runnable t2 = () -> System.out.println("This is called thread 2");
        new Thread(t2).start();

        Runnable t3 = () -> {
            System.out.println("This is called thread 3");
            System.out.println("This is called thread 3.1");
        };
        new Thread(t3).start();
    }
}
