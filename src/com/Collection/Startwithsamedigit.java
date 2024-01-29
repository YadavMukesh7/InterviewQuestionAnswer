package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Startwithsamedigit {

    public static void main(String[] args) {
        ArrayList<Integer> evn = new ArrayList<>();
        evn.add(1);
        evn.add(212);
        evn.add(248);
        evn.add(224);
        evn.add(540);
        evn.add(660);
        evn.add(7);
        evn.add(8);
        evn.add(9);
        System.out.println();

        List<Integer> collect = evn.stream().filter((i) -> i % 2 == 0).toList().stream().filter(j -> String.valueOf(j).startsWith("2")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
