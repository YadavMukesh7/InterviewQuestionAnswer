package com.java8newfeature.Streams.Optional;

import com.java8newfeature.Streams.FlatMap.Employee;

import java.util.*;

public class OptionalClass {
    public static void main(String[] args) {
        Employee emp = new Employee(Arrays.asList("Noida", "Delhi", "Mumbai"), 101, null);

        //  *******We can create 3 type optional object********

        // empty
        // of
        // ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> nameOptional= Optional.of(emp.getName());
//        System.out.println(nameOptional);

        Optional<String> namesOptional = Optional.ofNullable(emp.getName());
        //Print value if present
//        namesOptional.ifPresent(System.out::println);
//        System.out.println(namesOptional);

        //Return default value
//        System.out.println(namesOptional.orElse("abc@gmail.com"));

        //Return default value using supplier
//        System.out.println(namesOptional.orElseGet(()->"This is default value"));

        //Throw exception
//        System.out.println(namesOptional.orElseThrow(()->new IllegalArgumentException("Name is not present")));

        //We can directly call the map on optional class
        System.out.println(namesOptional.map(String::toUpperCase).orElseGet(() -> "This is default message...!!"));


//*******************************************************************************************************************//
        List<Employee> employees = new ArrayList<>();
        List<String> city1 = new ArrayList<>();
        city1.add("Noida");
        city1.add("Noida");
        city1.add("Bengaluru");
        city1.add("Pune");
        city1.add("Mumbai");
        city1.add("Delhi");
        Employee emp1 = new Employee(city1, 1, "Mukesh");

        List<String> city2 = new ArrayList<>();
        city2.add("Mohali");
        city2.add("Punjab");
        city2.add("Mumbai");
        city2.add("Bengaluru");
        Employee emp2 = new Employee(city2, 2, "Bhairav");

        employees.add(emp1);
        employees.add(emp2);

        System.out.println(employees.stream().filter((employee -> "Mukesh".equalsIgnoreCase(employee.getName()))).findAny().orElseGet(() -> emp2));

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        double average = number.stream().mapToDouble(a -> a.doubleValue()).sum() / number.size();
        System.out.println(average);

        //Method Reference
        double average1 = number.stream().mapToDouble(Integer::doubleValue).sum() / number.size();
        System.out.println(average1);

        OptionalDouble average2 = number.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(average2.getAsDouble());

        double average3 = number.stream().reduce(Integer::sum).get().doubleValue()/number.size();
        System.out.println(average3);
    }
}
