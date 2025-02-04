package com.String;

public class CustomStringSplit {
    public static void main(String[] args) {
        System.out.println(split("babu#$#1234#$#kumar#$#", "#$#", new StringBuilder())); // babu 1234 kumar
        System.out.println(split("HelloNSWorldNSHowNSAreNSYou", "NS", new StringBuilder())); // Hello World How Are You
        System.out.println(split("NSNSNSNSNSNSHelloNSWorldNSHowNSAreNSYou", "NS", new StringBuilder())); // Hello World How Are You
        System.out.println(split("HelloNSWorldNSHowNSAreNSYouNSNSNSNSNSNS", "NS", new StringBuilder())); // Hello World How Are You
        System.out.println(split("NSNSNSNSNSNS", "NS", new StringBuilder())); // Empty
        System.out.println(split("NSSNSNSNNS", "NS", new StringBuilder())); // S N
    }

    private static StringBuilder split(String str, String delimeter, StringBuilder container) {
        if (str == null || str.isBlank()) {
            return container;
        }
        int nextIndex = str.indexOf(delimeter);

        container.append(nextIndex >= 0 ? str.substring(0, nextIndex).isBlank() ? "" : str.substring(0, nextIndex) + " " : "");
        str = nextIndex >= 0 ? str.substring(nextIndex + delimeter.length()) : "";
        return str.contains(delimeter) ? split(str, delimeter, container) : container.append(str);
    }
}