package com.String;

public class CountStringCharacter {
    public static void main(String[] args) {
        String str = "Hare Krishna Hare Krishna";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
