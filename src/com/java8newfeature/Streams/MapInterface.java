package com.java8newfeature.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Krishna");
        names.put(2, "Ram");
        names.put(3, "Govind");

        names.forEach((rollNo, Name) -> System.out.println("RollNo :" + rollNo + ", Name :" + Name));
        names.entrySet().forEach(System.out::println);

        List<String> str = new ArrayList<>();
        str.add("Krishna");
        str.add("Ram");
        str.add("Govind");
        str.add("Kanha");

//        List<String> listOfName = str.stream().filter(s -> s.startsWith("K")).toList();
//        System.out.println(listOfName);
          str.stream().filter(s -> s.startsWith("K")).forEach(System.out::println);
    }
}
