package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Krishna", 88888888);
        m.put("Ram", 999999999);
        m.put("Mukesh", 100);
        Set<Map.Entry<String, Integer>> entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = (Map.Entry) iterator.next();
            System.out.println(next);
        }
    }
}
