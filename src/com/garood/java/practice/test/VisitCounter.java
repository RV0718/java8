/*
package com.garood.java8.practice.test;

import java.util.*;

public class VisitCounter {

    public static void main(String[] args) {

        Map<String, UserStats> m1  = new HashMap<>();
        m1.put("123qw",new UserStats());
        m1.put("123",new UserStats());

        Map<String, UserStats> m2  = new HashMap<>();
        m2.put("123qw",null);
        m2.put("123",new UserStats());

        Map<String, UserStats> m3  = new HashMap<>();
        UserStats u1 = new UserStats();
        u1.setVisitCount(Optional.of(12L));
        m3.put("123qw",u1);

        Map<String,UserStats> m4 = Collections.emptyMap();

        //count(m1,m2,m3,m4,null);
        count(null);
    }

    static Map<Long, Long> count(Map<String, UserStats>... visits) {

        Map<Long, Long> r = new HashMap<>();

        if(visits == null)
            return r;

        for(Map<String,UserStats> m: visits){
            if(m != null && !m.isEmpty()) {
                for (Map.Entry<String, UserStats> map : m.entrySet()) {
                    try{
                        Long l = Long.valueOf(map.getKey());

                        if(map.getValue() == null){
                            continue;
                        }else if(!map.getValue().getVisitCount().isPresent()){
                            continue;
                        }

                        if(!r.containsKey(l)){
                            r.put(l,map.getValue().getVisitCount().get());
                        }else{
                            r.put(l,r.get(l)+map.getValue().getVisitCount().get());
                        }

                    }catch(Exception e){
                        continue;
                    }

                }
            }
        }


        Arrays.stream(visits)
                .filter(v -> v!= null && !v.isEmpty())
                //.flatMap(Map::entry)

                .map(Map::entrySet)
                .forEach((k,v) -> {
                    System.out.println("k");
                    System.out.println("v");
                });


*/
/*
                .flatMap(Map::keySet){
                    try{
                        Long l = Long.valueOf(m.stream());

                        if(map.getValue() == null){
                            continue;
                        }else if(!map.getValue().getVisitCount().isPresent()){
                            continue;
                        }

                        if(!r.containsKey(l)){
                            r.put(l,map.getValue().getVisitCount().get());
                        }else{
                            r.put(l,r.get(l)+map.getValue().getVisitCount().get());
                        }

                    }catch(Exception e){

                    })
*//*


        return r;
    }

}
*/
