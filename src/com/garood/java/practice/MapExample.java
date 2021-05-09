package com.garood.java.practice;

import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, (abc, one) -> abc + one);


        System.out.println(map);
    }
}
