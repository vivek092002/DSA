package com.DSA.searching.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binaryBuiltInMethod {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);

        // returns index
        int index = Collections.binarySearch(al,10);
        System.out.println(index);

        //if Element is not present then it returns (-(insertion point)-1)
        index = Collections.binarySearch(al,15);
        System.out.println(index);
    }
}
