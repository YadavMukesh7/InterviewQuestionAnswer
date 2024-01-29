package com.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector vct = new Vector();
        vct.add("Hare Krishna");
        vct.addElement(1);
        vct.addElement(null);
        vct.addElement(true);
        Enumeration enm = vct.elements();

        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }
    }
}
