package com.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Tset {
    public static void main(String[] args) {
        TreeSet tr = new TreeSet(new implComparator());
        tr.add(1);
        tr.add(11);
        tr.add(0);
        tr.add(7);
        tr.add(9);
        tr.add(2);
        tr.add(2);
        System.out.println(tr);
    }

    public static class implComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;

            if (i1 < i2) {
                return 1;
            } else if (i1 > i2) {

                return -1;
            } else {
                return 0;
            }
        }
    }
}

