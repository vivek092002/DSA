package com.DSA.hashing.gfg;

import java.util.HashSet;

public class subArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {4,-3,2,1};
        int n = arr.length;
        System.out.println(isSumZero(arr));
        System.out.println(findSum(arr,n));
    }

    //Naive Solution O(N^2)
    public static boolean isSumZero(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                if (curr_sum == 0){
                    return true;
                }
            }
        }
        return false;
    }

    //using hash set O(N)
    public static boolean findSum(int[] arr, int n){
        HashSet<Integer> st = new HashSet<>();
        int pre_sum = 0;
        for (int i = 0; i < n; i++) {
            pre_sum += arr[i];
            if (st.contains(pre_sum)){
                return true;
            }
            if (pre_sum == 0){
                return true;
            }
            st.add(pre_sum);
        }

        return false;
    }
}
