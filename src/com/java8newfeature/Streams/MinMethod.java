package com.java8newfeature.Streams;

import java.util.ArrayList;

public class MinMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        Integer i = l.stream().min((n1, n2) -> n1.compareTo(n2)).get();
        System.out.println("Minimum value is: "+ i);
    }
}
