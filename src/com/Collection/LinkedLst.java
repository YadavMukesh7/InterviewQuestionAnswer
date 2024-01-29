package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLst {
    public static void main(String[] args) {
        List lst = new LinkedList();
        lst.add("Hare Krishna");
        lst.add(1);
        lst.add(null);
        lst.add(true);
        lst.add("Hare Krishna");
        Iterator itr = lst.iterator();
        int count = 0;
        while (itr.hasNext()) {
            System.out.print(itr.next() + ",");
        }
    }
}
