package com.Collection;

import java.util.ArrayList;

public class ComparingList {

    public static void main(String[] args) {

        ArrayList<Stu> list1 = new ArrayList<>();
        list1.add(new Stu(18, "Krishna", "Vrindavan"));
        list1.add(new Stu(19, "Ram", "Ayodhya"));
        list1.add(new Stu(22, "Mukesh", "Noida"));

        ArrayList<Stu> list2 = new ArrayList<Stu>();
        list2.add(new Stu(18, "Krishna", "Vrindavan"));
        list2.add(new Stu(19, "Ram", "Ayodhya"));
        list2.add(new Stu(25, "Mukesh Yadav", "Noida U.P"));

        for (int i = 0; i < list1.size(); i++) {

            if (list1.get(i).toString().equals(list2.get(i).toString())) {
                System.out.println("List is equal :" + list2.get(i));
            } else {
                System.out.println(list1.get(i) + "Update this data this is not matching with db data");
            }

        }

//        System.out.println(list2);
//        System.out.println(list1.equals(list2));
    }
}
