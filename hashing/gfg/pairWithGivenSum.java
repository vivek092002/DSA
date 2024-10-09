package com.DSA.hashing.gfg;

import java.util.HashSet;
import java.util.Set;

public class pairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,4,7};
        int sum = 14;

        System.out.println(isPair(arr,sum));
    }

    public static boolean isPair(int[] arr, int sum){
        Set<Integer> st = new HashSet<Integer>();
        for (int x : arr){
            if (st.contains(sum-x)){
                return true;
            } else {
                st.add(x);
            }
        }
        return false;
    }
}
