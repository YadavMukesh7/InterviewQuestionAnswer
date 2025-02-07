package com.java8newfeature.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedMethod {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Krishna");
        l.add("Balram");
        l.add("Ram");
        l.add("Lakshman");
        List<String> l1 = l.stream().sorted().toList(); // Default natural sorting
        System.out.println("After default sorting :" + l1);
        // List<String> l2 = l.stream().sorted((s1, s2) -> s2.compareTo(s1)).toList(); // Customize sorting
        List<String> l2 = l.stream().sorted(Comparator.reverseOrder()).toList(); //Comparator.reverseOrder() provides a comparator that reverses the natural ordering of the elements.
        System.out.println("After customize sorting :" + l2);
    }
}
