package com.java8newfeature.Functional_Interface;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Hare Krishna"));
    }
}
