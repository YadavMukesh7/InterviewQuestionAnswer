package com.java8newfeature.MethodAndConstructorReference;

public class ByMethodReference {
    public static void m() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Runnable r = ByMethodReference::m; // Method reference used
        Thread t = new Thread(r);
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("Main Thread");
        }
    }


}
