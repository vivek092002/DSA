//Hashing is very useful to keep track of the frequency of the elements in a list.
//
//        You are given an array of integers. You need to print the non-repeated elements as they appear in the array.
//
//        Example 1:
//
//        Input:
//        n = 10
//        arr[] = {1,1,2,2,3,3,4,5,6,7}
//        Output: 4 5 6 7
//        Explanation: 4, 5, 6 and 7 are the only
//        elements which is having only 1
//        frequency and hence, Non-repeating.

package com.DSA.hashing.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class nonRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6,7};
        int n = arr.length;
        System.out.println((Arrays.toString(new ArrayList[]{printNonRepeated(arr, n)})));
    }

    public static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i])+1);
            } else {
                h.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (h.get(arr[i]) == 1){
                list.add(arr[i]);
            }
        }

        return list;
    }
}
