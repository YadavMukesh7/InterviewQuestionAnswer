package com.java8newfeature.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(0);
        l1.add(15);
        l1.add(10);
        l1.add(5);
        l1.add(30);
        l1.add(25);
        l1.add(20);

        System.out.println(l1);

        // Map: Add 10 to each element in the list
        List<Integer> l2 = l1.stream().map(i -> i + 10).collect(Collectors.toList());
        System.out.println(l2);

        // Filter: Count even numbers in the list
        long count = l1.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);

        // Sort: Sort the list in ascending order
        List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);

        // Comparator: Custom comparator (although this is redundant since Integer already has a natural ordering)
        Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);

        // Sort using custom comparator
        List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(l4);

        // Find minimum value in the list
        Integer min = l1.stream().min(comp).get();
        System.out.println(min);

        // Find maximum value in the list
        Integer max = l1.stream().max(comp).get();
        System.out.println(max);

        // Print each element in the sorted list using forEach
        l3.forEach(System.out::println);
    }
}
