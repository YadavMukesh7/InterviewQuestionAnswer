package com.java8newfeature;

public class ThreadWithLambdaArgs {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("Main Thread");
        }
    }
}
