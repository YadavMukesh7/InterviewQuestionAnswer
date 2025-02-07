package com.java8newfeature.Streams;

import java.util.ArrayList;
import java.util.List;

public class CollectAndMapMethod {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("krishna");
        l.add("balram");
        l.add("ram");
        l.add("lakshman");
        //   List<String> l1 = l.stream().map((s) -> s.toUpperCase()).toList();
        //   This is using method reference
        List<String> l1 = l.stream().map(String::toUpperCase).toList();
        System.out.println(l1);
    }
}
