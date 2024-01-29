package com.String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Krishna";

        //First approach
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println(" ");
        //Second approach
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        //Third approach
        System.out.println("");
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
