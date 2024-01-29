package com.designPattern;

class A {
    private static A obj;
    private String name = "Hare Krishna";

    private A() {
    }

    public static A getA() {
        if (obj == null) {
            synchronized (A.class) {
                if (obj == null) {
                    obj = new A();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        getA().doSomething();
    }

    public void doSomething() {
        System.out.println(getA().name);
    }
}


