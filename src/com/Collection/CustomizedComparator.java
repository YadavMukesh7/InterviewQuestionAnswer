package com.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomizedComparator {
    public static void main(String[] args) {
        TreeSet tr = new TreeSet(new CompTest());
        Stu st = new Stu(18, "Krishna", "Vrindavan");
        Stu st1 = new Stu(27, "Rahul", "Noida");
        Stu st2 = new Stu(22, "Mukesh", "Noida");
        Stu st3 = new Stu(29, "Sumit", "Delhi");
        Stu st4 = new Stu(30, "Himanshu", "Agra");

        tr.add(st);
        tr.add(st1);
        tr.add(st2);
        tr.add(st3);
        tr.add(st4);
        System.out.println(tr);
    }
}

class CompTest implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Stu record = (Stu) o1;
        Stu record1 = (Stu) o2;

        String name = record.getName();
        String name2 = record1.getName();
        return name.compareTo(name2);
    }
}
