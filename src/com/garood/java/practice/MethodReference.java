package com.garood.java.practice;

import java.util.Comparator;

public class MethodReference {

    //CLassName :: methodName

    public static void main(String[] args) {
        System.out.println(MethodReference.compare(12, 23));


        Comparator<Integer> c2 = MethodReference::compare;
        System.out.println(c2.compare(12, 34));
    }

    static int compare(int x, int y) {
        return Integer.compare(x, y);
    }
}
