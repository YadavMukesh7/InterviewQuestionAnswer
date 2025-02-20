package com.java8newfeature.Streams;

import java.util.*;

public class CustomMapSorting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Cherry", 8);
        map.put("Mango", 3);

        // Sorting using collection sort method
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        System.out.println(entries);

        // Sorting using stream
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(map::get))).forEach(System.out::println);
    }
}
