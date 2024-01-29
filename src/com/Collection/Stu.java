package com.Collection;

public class Stu {
    private int age;
    private String name;
    private String address;

    public Stu(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Stu{" + "age=" + age + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
