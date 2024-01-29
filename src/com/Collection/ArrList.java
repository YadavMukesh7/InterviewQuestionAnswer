package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrList {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        lst.add("Krishna");
        lst.add("Krishna");
        lst.add(2);
        lst.add(null);
        lst.add(true);
        lst.remove(null);
        lst.add(2, 7);

        ListIterator litr = lst.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + ",");
        }

        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + "+");
        }

    }
}
