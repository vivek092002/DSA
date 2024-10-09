//ERROR

package com.DSA.hashing.gfg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class positiveNegativePair {
    public static void main(String[] args) {
        int[] arr = {1,3,6,-2,-1,-3,2,7};
        int n = 8;
        System.out.println(findPairs(arr,n));
    }

    public static ArrayList<Integer> findPairs(int arr[], int n) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> st = new HashSet<Integer>();

        for (int x : arr){
            st.add(x);
        }

        for (int x : arr){
            if (x>0 && st.contains(-x)){
                list.add(x);
            }
        }

        return list;
    }
}
