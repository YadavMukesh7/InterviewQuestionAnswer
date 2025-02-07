package com.java8newfeature.Lambda;

class ThreadWithoutLambdaExp implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread !!");
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Runnable r = new ThreadWithoutLambdaExp();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread !!");
        }
    }
}

