package com.java8newfeature.Streams;

import java.util.*;

public class SortedMethod {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hare Krishna");
        map.put(2, "Hare Ram");
        map.put(3, "Radha Govind");

        ArrayList<String> l = new ArrayList<String>();
        l.add("Krishna");
        l.add("Balram");
        l.add("Ram");
        l.add("Lakshman");
        l.stream().sorted().forEach(System.out::println); // Default natural sorting
        // List<String> l2 = l.stream().sorted((s1, s2) -> s2.compareTo(s1)).toList(); // Customize sorting
        List<String> l2 = l.stream().sorted(Comparator.reverseOrder()).toList(); //Comparator.reverseOrder() provides a comparator that reverses the natural ordering of the elements.
        System.out.println("After customize sorting :" + l2);

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
    }
}
