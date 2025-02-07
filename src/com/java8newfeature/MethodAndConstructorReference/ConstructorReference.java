package com.java8newfeature.MethodAndConstructorReference;

interface interf {
    public Sample get(String s);
}

class Sample {
    private String s;

    public Sample(String s) {
        this.s = s;
        System.out.println("Constructor Executed:" + s);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        interf f = s -> new Sample(s);
        f.get("From Lambda Expression");
        interf f1 = Sample::new;
        f1.get("From Constructor Reference");
    }
}
