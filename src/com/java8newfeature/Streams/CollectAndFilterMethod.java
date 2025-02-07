package com.java8newfeature.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAndFilterMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        List<Integer> l1 = l.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l1);
    }

}
