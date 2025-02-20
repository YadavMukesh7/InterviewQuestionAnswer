package com.java8newfeature.Streams.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceFunctions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> str = List.of("Krishna", "Ram", "Govind");

        // Using reduce to find the maximum number
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        Optional<Integer> sum1 = numbers.stream().reduce((Integer::sum));
        System.out.println(sum);

        Integer mult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mult);

        Integer max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        Optional<Integer> max1 = numbers.stream().reduce(Integer::max);
        System.out.println(max1.get());

        int average = numbers.stream().reduce(Integer::sum).get() / numbers.size();
        System.out.println(average);

        String length = str.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(length);
    }
}
