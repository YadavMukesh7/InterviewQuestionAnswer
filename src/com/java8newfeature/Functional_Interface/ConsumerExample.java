package com.java8newfeature.Functional_Interface;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = s-> System.out.println(s);
                c.accept("Hare Krishna");
    }
}
