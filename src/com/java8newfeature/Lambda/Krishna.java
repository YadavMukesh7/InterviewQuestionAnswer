package com.java8newfeature.Lambda;

interface Test {
    public void mukesh();
}

public class Krishna {
    Test t = new Test() {
        @Override
        public void mukesh() {
            System.out.println("Hare Krishna");
        }
    };
    public static void main(String[] args) {
        Krishna k = new Krishna();
        k.t.mukesh();
    }
}
