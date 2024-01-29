package com.String;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        System.out.println("Please enter an string.......");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LinkedHashMap<Character, Integer> vowels = new LinkedHashMap<>();

        vowels.put('A', 0);
        vowels.put('E', 0);
        vowels.put('I', 0);
        vowels.put('O', 0);
        vowels.put('U', 0);

        for (int i = 0; i < str.length() ; i++) {

            if (vowels.containsKey(str.charAt(i))) {
                int count = vowels.get(str.charAt(i));
                vowels.put(str.charAt(i), ++count);
            }
        }
        System.out.println(vowels);

    }
}
