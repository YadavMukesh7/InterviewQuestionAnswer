package com.java8newfeature.Streams;

import java.util.ArrayList;

public class MaxMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        Integer i = l.stream().max(Integer::compareTo).get();
        System.out.println("Maximum value is: " + i);
    }
}
