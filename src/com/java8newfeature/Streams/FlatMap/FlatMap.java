package com.java8newfeature.Streams.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String> city1 = new ArrayList<>();
        city1.add("Noida");
        city1.add("Noida");
        city1.add("Bengaluru");
        city1.add("Pune");
        city1.add("Mumbai");
        city1.add("Delhi");
        Employee emp = new Employee(city1, 1, "Mukesh");

        List<String> city2 = new ArrayList<>();
        city2.add("Mohali");
        city2.add("Punjab");
        city2.add("Mumbai");
        city2.add("Bengaluru");
        Employee emp1 = new Employee(city2, 2, "Bhairav");

        List<String> city3 = new ArrayList<>();
        city3.add("Indore");
        city3.add("Jaipur");
        Employee emp2 = new Employee(city3, 3, "Mulayam");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);

        // Printing employee city by using map
        List<List<String>> cities = employees.stream().map(Employee::getCity).toList();
        System.out.println(cities);

        // Printing employee city by using flatmap
        Set<String> ct = employees.stream().flatMap(e -> e.getCity().stream()).collect(Collectors.toSet());
        System.out.println(ct);
    }
}

class Employee {
    private int id;
    private String name;
    private List<String> city;

    public Employee(List<String> city, int id, String name) {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "city=" + city + ", id=" + id + ", name='" + name + '\'' + '}';
    }
}
