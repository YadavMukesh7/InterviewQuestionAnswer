package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class OccurrencesOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> acc = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (acc.containsKey(c)) {
                Integer count = acc.get(c);
                acc.put(c, ++count);
            } else {
                acc.put(c, 1);
            }
        }
        System.out.println(acc);
    }
}
