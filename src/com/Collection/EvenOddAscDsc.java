package com.Collection;

import java.util.ArrayList;
import java.util.Collections;


public class EvenOddAscDsc {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        number.forEach((i) -> {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        });
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        ArrayList sort = new ArrayList();
        sort.addAll(even);
        sort.addAll(odd);
        System.out.println(sort);

    }
}
