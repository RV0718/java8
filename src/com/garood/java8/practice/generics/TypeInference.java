package com.garood.java8.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();
        addItems("1",list);
    }

    static <T> void addItems(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println("Item added successfully");
    }
}

class Bucket<T> {
    private T item;


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
