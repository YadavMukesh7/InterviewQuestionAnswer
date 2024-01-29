package com.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class StringComp {
    public static void main(String[] args) {
        TreeSet tr = new TreeSet(new StrCpr());
        tr.add("Krishna");
        tr.add("Ram");
        tr.add("Mukesh");
        tr.add("Rahul");
        System.out.println(tr);
    }
}

class StrCpr implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.compareTo(s2);
    }
}