package com.java8newfeature.Functional_Interface;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> l = () -> {
            String[] name = {"Krishna", "Balram", "Ram", "Laxman"};
            int i = (int) (Math.random() * 4);
            return name[i];
        };
        System.out.println(l.get());
        System.out.println(l.get());
        System.out.println(l.get());
    }
}
