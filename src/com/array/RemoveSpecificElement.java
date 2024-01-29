package com.array;

import java.util.ArrayList;

public class RemoveSpecificElement {

    public static void main(String[] args) {
        Integer[] originalArray = {1, 2, 20, 30, 4, 5};
        int elementToRemove = 30;


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : originalArray) {
            if (value != elementToRemove) {
                arrayList.add(value);
            }
        }


        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }


        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}


