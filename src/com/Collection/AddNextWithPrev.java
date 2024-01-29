package com.Collection;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class AddNextWithPrev {
    public static void main(String[] args) {
        ArrayList<Integer> evn = new ArrayList<>();
        evn.add(1);
        evn.add(2);
        evn.add(3);
        evn.add(4);
        evn.add(5);
        evn.add(6);
        evn.add(7);
        evn.add(8);
        evn.add(9);
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i = 0; i < evn.size() - 1; i++) {
            int add = evn.get(i) + evn.get(i + 1);
            newlist.add(add);
            System.out.println(evn.get(i));
        }
        System.out.println(newlist);
//        ZoneId zone = ZoneId.systemDefault();
        ZoneId z = ZoneId.of("America/Chicago");
        ZonedDateTime zt = ZonedDateTime.now(z);
        System.out.println(zt);

    }
}

