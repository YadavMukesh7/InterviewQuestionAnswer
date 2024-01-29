package com.String;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Programming";
        //First Approach
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println("Using first approach => " + sb);

        //Second approach
        char[] charArray = str.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < charArray.length; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb1.append(charArray[i]);
            }
        }
        System.out.println("Using second approach => " + sb1);
    }
}
