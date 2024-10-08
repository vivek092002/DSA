package com.DSA.hashing.gfg;

import java.util.HashSet;

public class intersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        int n = a.length;
        int m = b.length;
        intersection(a,b,n,m);
    }

    public static void intersection(int[] a, int[] b, int n, int m){
        //for storing the element
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < m; i++) {
            h.add(b[i]);
        }

        for (int i = 0; i < n; i++) {
            if (h.contains(a[i])){
                System.out.println(a[i] + " ");
            }
        }
    }
}
