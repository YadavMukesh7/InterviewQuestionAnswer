package com.java8newfeature.Lambda;

interface Test {
    public void mukesh();
}

public class Krishna {
    public static void main(String[] args) {
        //Anonymous inner class implementation
        Test t = new Test() {
            @Override
            public void mukesh() {
                System.out.println("He Govind !!");
            }
        };
        t.mukesh();
    }
}
