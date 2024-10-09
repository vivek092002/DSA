package com.DSA.hashing.gfg;

import java.util.HashSet;

public class unionOfUnsortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2,3};

        System.out.println(doUnion(arr1,arr2));
    }

    public static int doUnion(int arr1[], int arr2[]) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            h.add(arr2[i]);
        }

        return h.size();
    }
}
