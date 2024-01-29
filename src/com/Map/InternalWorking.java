package com.Map;

import java.util.Hashtable;

public class InternalWorking {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new Temp(5), "Hare Krishna");
        ht.put(new Temp(7), "A");
        ht.put(new Temp(8), " B");
        ht.put(new Temp(24), "C");
        ht.put(new Temp(16), "D");
        System.out.println(ht);
    }
}

class Temp {
    private int i;

    public Temp(int i) {
        this.i = i;
    }

    public int hashCode() {
        return this.i;
    }

    public String toString() {
        return i + "";
    }
}
