package com.DSA.hashing.gfg;

import java.util.HashMap;
import java.util.Map;

public class printFrequenciesOfElement {
    public static void main(String[] args) {
        int[] arr = {10,12,10,15,10,20,12,12};
        int n = arr.length;

        //printFreq(arr,n);
        countFreq(arr);
    }

    //Naive Solution O(N^2)
    public static void printFreq(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                continue;
            }
            int freq = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i] + " : " + freq);
        }
    }

    //Efficient Solution
    public static void countFreq(int[] arr){
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int x : arr){
            h.put(x, h.getOrDefault(x,0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
