package com.java8newfeature.Streams;

import java.util.ArrayList;

public class CountMethod {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Krishna");
        l.add("Balram");
        l.add("Ram");
        l.add("Lakshman");
        Long l1 = l.stream().filter((s) -> s.length() > 5).count();
        System.out.println("String which have more than 5 character: " + l1);
    }
}
