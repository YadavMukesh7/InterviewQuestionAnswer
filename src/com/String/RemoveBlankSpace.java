package com.String;

public class RemoveBlankSpace {
    public static void main(String[] args) {
        String s = "   H  ar e Kr i s h  n a ";
        //First Approach
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println(" ");
        //Second approach
        String str = s.replaceAll("\\s", "");
        System.out.println(str);
    }
}
