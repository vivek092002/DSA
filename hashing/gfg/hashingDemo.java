package com.DSA.hashing.gfg;

import java.util.HashSet;
import java.util.Iterator;

public class hashingDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");


        System.out.println(h);
        System.out.println(h.contains("ide"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next() + " ");
        }
    }
}
