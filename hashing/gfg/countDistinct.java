package com.DSA.hashing.gfg;

import java.util.HashSet;

public class countDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
        //System.out.println(countDis(arr));
        System.out.println(countDis1(arr));
    }

    //Naive Solution O(N^2)
    public static int countDis(int[] arr){

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                res++;
            }
        }
        return res;
    }

    //Optimised Solution (Hashing)
    public static int countDis1(int[] arr){
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }

        return h.size();
    }
}
