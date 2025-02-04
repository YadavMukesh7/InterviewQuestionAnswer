package com.array;

public class MultiDArray {
    public static void main(String[] args) {
//        String[][] str = new String[2][3];
//        str[0][0] = "Hare";
//        str[0][1] = "Krishna";
//        str[0][2] = "Mukesh";
//        str[1][0] = "Hare";
//        str[1][1] = "Ram";
//        str[1][2] = "Yadav";
        String[][] str = {{"A", "B", "c", "D"}, {"E", "F", "G"}};
        for (String[] names : str) {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
